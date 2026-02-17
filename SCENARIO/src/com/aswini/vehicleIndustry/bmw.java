package com.aswini.vehicleIndustry;

public class bmw extends car {
        private int number;
        private double price;
        private int colour;
        private bmwmodels bmwmodel;
        bmwmodels b1=new bmwmodels();
        private int bmwmod;
        private double Eprice;
		public bmw(String model, int number, int colour) {
			super(model);
			this.number = number;
			this.colour = colour;
			this.colour(number);
		}
		public void bmwmodel(int bmwmodel)
		{
			if(bmwmodel==1)
			{
				this.bmwmod= b1.bmwmodels1();
			}
			else if(bmwmodel==2)
			{
				this.bmwmod= b1.bmwmodels2();
			}
			else
			{
				this.bmwmod= b1.bmwmodels3();
			}
		}
		public int getmodels()
		{
			return this.bmwmod;
		}
		public int number()
		{
			return this.number;
		}
		public void colour(int colour)
		{
			
				if(colour==1)
				{
					 Eprice=100000;
				}
				
				else
				{
					 Eprice=500000;
				}
			
		}
		public double getcolorprice()
		{
			return Eprice;
		}
		public void claculates()
		{
			System.out.println("Total price is : "+getmodels()*number()*getcolorprice());
		}
        
}
