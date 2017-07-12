package com.beeva.batchdemo.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import com.beeva.batchdemo.job.fileProcessor.model.Empleado;

@Component
public class FileProcess implements ItemProcessor<Empleado,Empleado> {

	public Empleado process(Empleado empleado){
		System.out.println(empleado.toString());
		return empleado;
	}

}
