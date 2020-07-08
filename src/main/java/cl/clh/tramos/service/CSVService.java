package cl.clh.tramos.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import cl.clh.tramos.dto.Propuesta;
import cl.clh.tramos.util.StorageProperties;

@Service
public class CSVService {

	StorageProperties sp = new StorageProperties();
	String filePath;

	public void writeFile(List<Propuesta> propuestas, String rutEmpresa) {
		filePath = sp.getLocation();
		File file = new File(filePath + "/" + rutEmpresa + ".csv");
		try {
			FileWriter outputfile = new FileWriter(file);

			CSVWriter writer = new CSVWriter(outputfile);

			String[] header = { "periodo", "rut_empresa", "rut_trabajador", "dv_trabajador", "apellido_paterno",
					"apellido_materno", "nombres", "tramo", "fec_actualizacion", "mto_remu_mismo_empleador",
					"mto_otras_remu_dist_empleadores", "mto_renta_trab_indep", "subsidios", "pensiones", "mto",
					"num_meses", "renta_prom", "dec_jurada", "est_1", "est_2" };
			writer.writeNext(header);

			int i=0;
			Propuesta pr;
			for (i=0; i<propuestas.size(); i++) {
				pr = propuestas.get(i);
				writer.writeNext(pr.toStringArray());
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Propuesta> readFile(String filename){
		filePath = sp.getLocation();
	    List<Propuesta> propuestas = new ArrayList<>();
		Reader reader = null;
		try {
			reader = new FileReader(filePath + "/" + filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CSVReader csvReader = new CSVReader(reader);
	    List<String[]> list = new ArrayList<>();
	    try {
			list = csvReader.readAll();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			reader.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    try {
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    list.remove(0);
	    for(String[] lista:list) {
	    	propuestas.add(new Propuesta(lista));
	    }
	    
	    return propuestas;
	}

}
