package com.suzlon.assesment.model;

import java.util.ArrayList;
import java.util.List;

public class TurbineDAO {
	
	

	
	private static final List<Turbine> list = new ArrayList<Turbine>();
	 
	  static {
	      list.add(new Turbine("S128", "2,600 kW", "3.0 m/s", "9.3 m/s", "20 m/s"));
	      list.add(new Turbine("S111", "2,100 kW", "3.0 m/s", "10 m/s", "21 m/s"));
	      list.add(new Turbine("S97", "2,100 kW", "3.5 m/s", "11 m/s", "20 m/s"));
	      list.add(new Turbine("S88", "2,100 kW", "4.0 m/s", "14 m/s", "25 m/s"));
	      list.add(new Turbine("S82", "1,500 kW", "4.0 m/s", "12 m/s", "20 m/s"));
	      list.add(new Turbine("S66", "1,200 kW", "3.0 m/s", "14 m/s", "22 m/s"));
	      list.add(new Turbine("S52", "600 kW", "4.0 m/s", "13 m/s", "25 m/s"));
	  }
	 
	  public static List<Turbine> geTurbines() {
	      return list;
	  }

}
