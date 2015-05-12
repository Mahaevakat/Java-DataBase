package com.iasa.ka23.ManagementSystem.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;

import com.iasa.ka23.ManagementSystem.bl.model.Good;

public class SampleTable extends AbstractInterfaceUnit {

	@Override
	public void initComponents(){
	GridLayout gl = new GridLayout();
	gl.setColumns(1);
	windowContent.setLayout(gl);
	Integer total = 0;
	for (Good good: service.getAllGoods()){
		windowContent.add(new JLabel(good.getName()));
		total++;
	}
	JLabel label1 = new JLabel("TOTAL:" + total);
	windowContent.add(label1);
	frame.setName("My First App");
	frame.setContentPane(windowContent);
	frame.setSize(400,100);
	frame.setVisible(true);
	}

}
