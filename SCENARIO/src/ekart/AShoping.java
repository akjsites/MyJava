package ekart;

import java.util.Scanner;

public class AShoping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome Sir Our Shopping Provide This Type of service");
		System.out.println("1.searcing some product");
		System.out.println("2.collection of product");
		System.out.println("3.Order some product");
		System.out.println("4.return some product");
		System.out.println("5.emergency number");
		System.out.println("6.exit");
		while(true)
		{
			System.out.println("enter your choice");
			int number=sc.nextInt();
			switch(number)
			{
			case 1->{
				System.out.println("eneter your choice 1.Electronics (1.smartphones, laptops)");
				System.out.println("eneter your choice 2.Fashion (clothing, shoes) ");
				System.out.println("eneter your choice 3.Home Appliances 3.(TVs, washing machines)");
				System.out.println("eneter your choice 4.Groceries (Saffola Oats, Dal, Dry fruits)");
				System.out.println("eneter your choice 5.Beauty & Personal Care, and Stationery");
				int name=sc.nextInt();
				if(name==1)
				{
					System.out.println("1.smartphones, 2.laptops");
					int mainitemnumber=sc.nextInt();
					switch(mainitemnumber)
					{
					case 1->{
						System.out.println("1.vivo y20y price =12000"+"you want add then click 2 and enter 1");
						System.out.println("2.oppo nords3 price =22000"+"you want add then click 2 and enter 2");
						System.out.println("3.apple 16 price =1.9l"+"you want add then click 2 and enter 3");
						System.out.println("4.samsung s25 price =1.23l"+"you want add then click 2 and enter 4");
						
					}
					case 2->{
						System.out.println("1.dell 3520 price =50000"+"you want add then click 2 and enter 5");
						System.out.println("2.hp nords3 price 45000"+"you want add then click 2 and enter 6");
						System.out.println("3.apple w3 price =60000"+"you want add then click 2 and enter 7");
						System.out.println("4.realme x price =54000"+"you want add then click 2 and enter 8");
						
					}
					}
				}
				else if(name==2)
				{
					System.out.println("1.clothing, 2.shoes");
					int mainitemnumber=sc.nextInt();
					switch(mainitemnumber)
					{
					case 1->{
						System.out.println("1. Levi's Jeans price = 3500"+"you want add then click 2 and enter 9");
						System.out.println("2. Nike T-Shirt price = 2200"+"you want add then click 2 and enter 10");
						System.out.println("3. Adidas Jacket price = 7500"+"you want add then click 2 and enter 11");
						System.out.println("4. Puma Shoes price = 5600"+"you want add then click 2 and enter 12");
						System.out.println("5. Raymond Formal Shirt price = 2800"+"you want add then click 2 and enter 13");

						
					}
					case 2->{
						System.out.println("1. Nike Air Max price = 8500"+"you want add then click 2 and enter 14");
						System.out.println("2. Adidas Ultraboost price = 12000"+"you want add then click 2 and enter 15");
						System.out.println("3. Puma RS-X price = 7500"+"you want add then click 2 and enter 16");
						System.out.println("4. Reebok Classic Leather price = 6800"+"you want add then click 2 and enter 17");
						System.out.println("5. Bata Formal Shoes price = 3200"+"you want add then click 2 and enter 18");
						System.out.println("6. Woodland Hiking Boots price = 9500"+"you want add then click 2 and enter 19");
						System.out.println("7. Skechers Go Walk price = 5400"+"you want add then click 2 and enter 20");
						System.out.println("8. Converse Chuck Taylor price = 4500"+"you want add then click 2 and enter 21");

						
					}
					}
				}
				else if(name==3)
				{
					System.out.println("1.TVs, 2.washing ,3.machines");
					int mainitemnumber=sc.nextInt();
					switch(mainitemnumber)
					{
					case 1->{
						System.out.println("1. Samsung Smart TV 43 inch price = 28,000"+"you want add then click 2 and enter 22");
						System.out.println("2. LG OLED TV 55 inch price = 95,000"+"you want add then click 2 and enter 23");
						System.out.println("3. Sony Bravia 65 inch price = 1,20,000"+"you want add then click 2 and enter 24");
						System.out.println("4. Mi Smart TV 50 inch price = 38,000"+"you want add then click 2 and enter 25");


						
					}
					case 2->{
						System.out.println("1. LG Front Load 7kg price = 32,000"+"you want add then click 2 and enter 26");
						System.out.println("2. Samsung Top Load 6.5kg price = 24,500"+"you want add then click 2 and enter 27");
						System.out.println("3. Whirlpool Semi Automatic 8kg price = 15,000"+"you want add then click 2 and enter 28");
						System.out.println("4. IFB Fully Automatic 7.5kg price = 36,000"+"you want add then click 2 and enter 29");
					}
					case 3->{
						System.out.println("1. LG Front Load 7kg price = 32,000"+"you want add then click 2 and enter 30");
						System.out.println("2. Samsung Top Load 6.5kg price = 24,500"+"you want add then click 2 and enter 31");
						System.out.println("3. Whirlpool Semi Automatic 8kg price = 15,000"+"you want add then click 2 and enter 32");
						System.out.println("4. IFB Fully Automatic 7.5kg price = 36,000"+"you want add then click 2 and enter 33");

						
					}
					
				}
				}
				else if(name==4)
				{
					System.out.println("1.Saffola 2.Oats, 3.Dal, 4.Dry fruits");
					int mainitemnumber=sc.nextInt();
					switch(mainitemnumber)
					{
					case 1->{
						System.out.println("1. Saffola Gold Edible Oil 5L price = 1,250"+"you want add then click 2 and enter 34");
						System.out.println("2. Saffola Active Pro Weight Watchers Oil 1L price = 230"+"you want add then click 2 and enter 35");
						System.out.println("3. Saffola Oats Classic 1kg price = 180"+"you want add then click 2 and enter 36");
						System.out.println("4. Saffola Masala Oats 500g price = 120"+"you want add then click 2 and enter 37");

					}
					case 2->{
						System.out.println("1. Saffola Masala Oats 500g price = 120"+"you want add then click 2 and enter 38");
						System.out.println("2. Quaker Oats 1kg price = 180"+"you want add then click 2 and enter 39");
						System.out.println("3. Kellogg's Oats 1kg price = 170"+"you want add then click 2 and enter 40");
						System.out.println("4. Bagrry's Oats 1kg price = 160"+"you want add then click 2 and enter 41");
	
					}
					case 3->{
						System.out.println("1. Toor Dal (Arhar) 1kg price = 150"+"you want add then click 2 and enter 42");
						System.out.println("2. Moong Dal 1kg price = 130"+"you want add then click 2 and enter 43");
						System.out.println("3. Masoor Dal 1kg price = 120"+"you want add then click 2 and enter 44");
						System.out.println("4. Chana Dal 1kg price = 100"+"you want add then click 2 and enter 45");

	
					}
					case 4->{
						System.out.println("1. Almonds 1kg price = 850"+"you want add then click 2 and enter 46");
						System.out.println("2. Cashews 1kg price = 900"+"you want add then click 2 and enter 47");
						System.out.println("3. Raisins 1kg price = 450"+"you want add then click 2 and enter 48");
						System.out.println("4. Walnuts 1kg price = 1,200"+"you want add then click 2 and enter 49");

					}
					}
				}
				else if(name==5)
				{
					System.out.println("1.Beauty ,2.Personal Care,3.Stationery");
					int mainitemnumber=sc.nextInt();
					switch(mainitemnumber)
					{
					case 1->{
						System.out.println("1. Lakme Face Cream 50g price = 250"+"you want add then click 2 and enter 50");
						System.out.println("2. Maybelline Lipstick price = 499"+"you want add then click 2 and enter 51");
						System.out.println("3. L'Oréal Shampoo 650ml price = 550"+"you want add then click 2 and enter 52");
						System.out.println("4. Nivea Body Lotion 400ml price = 320"+"you want add then click 2 and enter 53");


						
					}
					case 2->{
						System.out.println("1. Colgate Toothpaste 200g price = 120"+"you want add then click 2 and enter 54");
						System.out.println("2. Dove Soap 125g (pack of 4) price = 220"+"you want add then click 2 and enter 55");
						System.out.println("3. Gillette Razor price = 350"+"you want add then click 2 and enter 56");
						System.out.println("4. Dettol Hand Wash 250ml price = 99"+"you want add then click 2 and enter 57");


						
					}
					case 3->{
						System.out.println("1. Camlin Geometry Box price = 120"+"you want add then click 2 and enter 58");
						System.out.println("2. Natraj Eraser (pack of 5) price = 30"+"you want add then click 2 and enter 59");
						System.out.println("3. Kangaro Stapler price = 150"+"you want add then click 2 and enter 60");
						System.out.println("4. Cello Highlighter (pack of 5) price = 200"+"you want add then click 2 and enter 60");

					}
					}
				}
				
			}
			case 2->{
				System.out.println("enter your collection");
				int collectionnumber=sc.nextInt();
				double collectionarr[]=new double[collectionnumber];
				String  collectionarritem[]=new String[collectionnumber];
								for(int i=0;i<collectionarr.length;i++)
				{
					System.out.println("enter your choice");
					collectionarr[i]=sc.nextDouble();
				}
				int sum=0;
				for(int j=0,i=0,a=0;j<collectionarr.length;j++,i++,a++)
				{
					if(collectionarr[j]==1)
					{
						sum+=12000;
						collectionarritem[i]="vivo y20y price = 12000";
					}
					else if(collectionarr[j]==2)
					{
						sum+=22000;
						
						collectionarritem[i]="oppo nords3 price = 22000";
					}
					else if(collectionarr[j]==3)
					{
						sum+=190000;
						collectionarritem[i]="apple 16 price = 1.9l";
					}
					else if(collectionarr[j]==4)
					{
						sum+=123000;
						collectionarritem[i]="samsung s25 price = 1.23l";
					}
					else if(collectionarr[j]==5)
					{
						sum+=50000;
						collectionarritem[i]="dell 3520 price = 50000";
					}
					else if(collectionarr[j]==6)
					{
						sum+=45000;
						collectionarritem[i]="hp nords3 price = 45000";
					}
					else if(collectionarr[j]==7)
					{
						sum+=60000;
						collectionarritem[i]="apple w3 price =60000";
					}
					else if(collectionarr[j]==8)
					{
						sum+=54000;
						collectionarritem[i]="realme x price =54000";
					}
					else if(collectionarr[j]==9)
					{
						sum+=3500;
						collectionarritem[i]="Levi's Jeans price = 3500";
					}
					else if(collectionarr[j]==10)
					{
						sum+=2200;
						collectionarritem[i]="Nike T-Shirt price = 2200";
					}
					else if(collectionarr[j]==11)
					{
						sum+=7500;
						collectionarritem[i]="Adidas Jacket price = 7500";
					}
					else if(collectionarr[j]==12)
					{
						sum+=5600;
						collectionarritem[i]="Puma Shoes price = 5600";
					}
					else if(collectionarr[j]==1.2)
					{
						sum+=2800;
						collectionarritem[i]="Raymond Formal Shirt price = 2800";
					}
					else if(collectionarr[j]==13)
					{
						sum+=8500;
						collectionarritem[i]="Nike Air Max price = 8500";
					}
					else if(collectionarr[j]==14)
					{
						sum+=12000;
						collectionarritem[i]="Adidas Ultraboost price = 12000";
					}
					else if(collectionarr[j]==15)
					{
						sum+=7500;
						collectionarritem[i]="Puma RS-X price = 7500";
					}
					else if(collectionarr[j]==16)
					{
						sum+=6800;
						collectionarritem[i]="Reebok Classic Leather price = 6800";
					}
					else if(collectionarr[j]==17)
					{
						sum+=3200;
						collectionarritem[i]="Bata Formal Shoes price = 3200";
					}
					else if(collectionarr[j]==1.2)
					{
						sum+=9500;
						collectionarritem[i]="Woodland Hiking Boots price = 9500";
					}
					else if(collectionarr[j]==18)
					{
						sum+=5400;
						collectionarritem[i]="Skechers Go Walk price = 5400";
					}
					else if(collectionarr[j]==19)
					{
						sum+=4500;
						collectionarritem[i]="Converse Chuck Taylor price = 4500";
					}
					else if(collectionarr[j]==21)
					{
						sum+=28000;
						collectionarritem[i]="Samsung Smart TV 43 inch price = 28,000";
					}
					else if(collectionarr[j]==22)
					{
						sum+=95000;
						collectionarritem[i]="LG OLED TV 55 inch price = 95,000";
					}
					else if(collectionarr[j]==23)
					{
						sum+=120000;
						collectionarritem[i]="Sony Bravia 65 inch price = 1,20,000";
					}
					else if(collectionarr[j]==24)
					{
						sum+=78000;
						collectionarritem[i]="Mi Smart TV 50 inch price = 38,000";
					}
					else if(collectionarr[j]==25)
					{
						sum+=32000;
						collectionarritem[i]="LG Front Load 7kg price = 32,000";
					}
					else if(collectionarr[j]==26)
					{
						sum+=24500;
						collectionarritem[i]="Samsung Top Load 6.5kg price = 24,500";
					}
					else if(collectionarr[j]==27)
					{
						sum+=15000;
						collectionarritem[i]="Whirlpool Semi Automatic 8kg price = 15,000";
					}
					else if(collectionarr[j]==28)
					{
						sum+=36000;
						collectionarritem[i]="IFB Fully Automatic 7.5kg price = 36,000";
					}
					else if(collectionarr[j]==29)
					{
						sum+=32000;
						collectionarritem[i]="LG Front Load 7kg price = 32,000";
					}
					else if(collectionarr[j]==30)
					{
						sum+=24500;
						collectionarritem[i]="Samsung Top Load 6.5kg price = 24,500";
					}
					else if(collectionarr[j]==31)
					{
						sum+=15000;
						collectionarritem[i]="Whirlpool Semi Automatic 8kg price = 15,000";
					}
					else if(collectionarr[j]==32)
					{
						sum+=36000;
						collectionarritem[i]="Woodland Hiking Boots price = 9500";
					}
					else if(collectionarr[j]==33)
					{
						sum+=1250;
						collectionarritem[i]="IFB Fully Automatic 7.5kg price = 36,000";
					}
					else if(collectionarr[j]==34)
					{
						sum+=230;
						collectionarritem[i]="Saffola Gold Edible Oil 5L price = 1,250";
					}
					else if(collectionarr[j]==35)
					{
						sum+=180;
						collectionarritem[i]=" Saffola Active Pro Weight Watchers Oil 1L price = 230";
					}
					else if(collectionarr[j]==36)
					{
						sum+=120;
						collectionarritem[i]="Saffola Oats Classic 1kg price = 180";
					}
					else if(collectionarr[j]==37)
					{
						sum+=120;
						collectionarritem[i]="Saffola Masala Oats 500g price = 120";
					}
					else if(collectionarr[j]==38)
					{
						sum+=180;
						collectionarritem[i]="Saffola Masala Oats 500g price = 120";
					}
					else if(collectionarr[j]==39)
					{
						sum+=170;
						collectionarritem[i]="Quaker Oats 1kg price = 180";
					}
					else if(collectionarr[j]==40)
					{
						sum+=160;
						collectionarritem[i]=" Kellogg's Oats 1kg price = 170";
					}
					else if(collectionarr[j]==41)
					{
						sum+=150;
						collectionarritem[i]="Bagrry's Oats 1kg price = 160";
					}
					else if(collectionarr[j]==42)
					{
						sum+=130;
						collectionarritem[i]="Toor Dal (Arhar) 1kg price = 150";
					}
					else if(collectionarr[j]==43)
					{
						sum+=120;
						collectionarritem[i]="Moong Dal 1kg price = 130";
					}
					else if(collectionarr[j]==44)
					{
						sum+=100;
						collectionarritem[i]="Masoor Dal 1kg price = 120";
					}
					else if(collectionarr[j]==45)
					{
						sum+=850;
						collectionarritem[i]="Chana Dal 1kg price = 100";
					}
					else if(collectionarr[j]==46)
					{
						sum+=900;
						collectionarritem[i]="Almonds 1kg price = 850";
					}
					else if(collectionarr[j]==47)
					{
						sum+=450;
						collectionarritem[i]="Cashews 1kg price = 900";
					}
					else if(collectionarr[j]==48)
					{
						sum+=1200;
						collectionarritem[i]="Raisins 1kg price = 450";
					}
					else if(collectionarr[j]==49)
					{
						sum+=250;
						collectionarritem[i]=" Walnuts 1kg price = 1,200";
					}
					else if(collectionarr[j]==50)
					{
						sum+=499;
						collectionarritem[i]="Lakme Face Cream 50g price = 250";
					}
					else if(collectionarr[j]==51)
					{
						sum+=550;
						collectionarritem[i]="Maybelline Lipstick price = 499";
					}
					else if(collectionarr[j]==52)
					{
						sum+=320;
						collectionarritem[i]="L'Oréal Shampoo 650ml price = 550";
					}
					else if(collectionarr[j]==53)
					{
						sum+=120;
						collectionarritem[i]="Nivea Body Lotion 400ml price = 320";
					}
					else if(collectionarr[j]==54)
					{
						sum+=220;
						collectionarritem[i]="Colgate Toothpaste 200g price = 120";
					}
					else if(collectionarr[j]==55)
					{
						sum+=350;
						collectionarritem[i]="Dove Soap 125g (pack of 4) price = 220";
					}
					else if(collectionarr[j]==56)
					{
						sum+=99;
						collectionarritem[i]="Gillette Razor price = 350";
					}
					else if(collectionarr[j]==57)
					{
						sum+=120;
						collectionarritem[i]="Dettol Hand Wash 250ml price = 99";
					}
					else if(collectionarr[j]==58)
					{
						sum+=30;
						collectionarritem[i]="Camlin Geometry Box price = 120";
					}
					else if(collectionarr[j]==59)
					{
						sum+=150;
						collectionarritem[i]=" Natraj Eraser (pack of 5) price = 30";
					}
					else if(collectionarr[j]==60)
					{
						sum+=200;
						collectionarritem[i]="Cello Highlighter (pack of 5) price = 200";
					}
					
				}
				System.out.println("-------------------------------");
				for(int k=0,i=0;k<collectionarritem.length;k++,i++)
				{
					
					System.out.println(collectionarritem[k]);
					
				}
				System.out.println("You Pay on our Shop : $"+sum);
				System.out.println("-------------------------------");
			}
			case 3->{
				System.out.println("Your Order SucessFully");
				System.exit(0);
			}
			case 4->{
			System.out.println("Return some product");
			System.out.println("What products You Wants to Exchange put your item number");
			int retur=sc.nextInt();
			if(true)
			{
				String x=sc.nextLine();
				System.out.println("submitted sucessfully");
				System.exit(0);
			}
			
			}
			case 5->{System.out.println("+91 "+Math.round(Math.random()*10000000)*1011);}
			case 6->{System.exit(0);}
			}
			
			}
		}

	}

