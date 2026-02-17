package streamapi_84;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamapi_84 {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		Employee1 employee1 = new Employee1("Anna", 27, 50000.0, "Male");
		Employee1 employee2 = new Employee1("Employee 2", 27, 51000.0, "Female");
		Employee1 employee3 = new Employee1("Bob", 27, 52000.0, "Male");
		Employee1 employee4 = new Employee1("EmplSmithoyeeee 4", 28, 53000.0, "Female");
		Employee1 employee5 = new Employee1("Employee 5", 29, 53000.0, "Male");
		Employee1 employee6 = new Employee1("Employee 6", 30, 55000.0, "Female");
		Employee1 employee7 = new Employee1("EmSmithployee 7", 31, 56000.0, "Male");
		Employee1 employee8 = new Employee1("Employee 8", 32, 57000.0, "Female");
		Employee1 employee9 = new Employee1("Employee 9", 35, 58000.0, "Male");
		Employee1 employee10 = new Employee1("EMPLOYEEeeseeee 10", 35, 59000.0, "Female");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		
		
// 1.	list.stream().filter(sal->sal.getSalary()>50000).forEach(name->System.out.println(name));
		
//2. 	OptionalDouble average = list.stream().mapToDouble(sal->sal.getSalary()).average();
//        average.ifPresent(s->System.out.println(s));

//   	list.stream().max((n,m)->Double.compare(n.getSalary(), m.getSalary())).ifPresent(n->System.out.println(n));

//		list.stream().min((n,m)->Double.compare(n.getSalary(), m.getSalary())).ifPresent(n->System.out.println(n));

//		Map<String, List<Employee1>> collect = list.stream().collect(Collectors.groupingBy(gen->gen.getGender()));
//	
//		collect.forEach((n,m)->System.out.println(n+" "+m));
		
//		long count = list.stream().filter(str->str.getGender().equals("Male")).count();
//		System.out.println(count);
		
//		double sum = list.stream().mapToDouble(bal->bal.getSalary()).sum();
//		System.out.println(sum);
		
//		list.stream().sorted((n,h)->n.getName().compareTo(h.getName())).forEach(s->System.out.println(s));
		
//		list.stream().max((n,l)->Integer.compare(n.getAge(), l.getAge())) .ifPresent(h->System.out.println(h));
		
//		Map<Integer, List<Employee1>> mo = list.stream().collect(Collectors.groupingBy(g->g.getAge()));
//		mo.forEach((s,h)->System.out.println(s+" "+h));
		
//         Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(s->s.getGender(), Collectors.summingDouble(p->p.getSalary())));
//		collect.forEach((h,j)->System.out.println(h+" "+j));
		
		
//		List<String> collect = list.stream().map(std->std.getAge()).distinct().map(s->s.toString()).collect(Collectors.toList());
//
//		System.out.println(collect);

//		list.stream().sorted((s,y)->Double.compare(s.getSalary(), y.getSalary())).limit(3).forEach(std->System.out.println(std));
		
//		list.stream().map(s->s.getName().charAt(0)).forEach(y->System.out.println(y));
		
//		Map<String, List<Employee1>> collect = list.stream().collect(Collectors.groupingBy(y->{
//			int age=y.getAge();
//			if(age>=20 && age<30)
//			{
//				return "20-30";
//			}
//			else if(age>=30 && age<40)
//			{
//				return "30-40";
//			}
//		     
//			else 
//			{
//				return "40+";
//			}
//			
//		}));
//		collect.forEach((u1,u2)->System.out.println(u1+" "+u2));
		
		
//		Integer orElseThrow3 = list.stream()
//				.collect(Collectors.groupingBy(Employee1::getAge,Collectors.counting())) // grouping ages and count
//				.entrySet() // converting to set
//				.stream()
//				.max(Map.Entry.comparingByValue()) // finding max value in map
//				.map(Map.Entry::getKey) // getting key of max value
//				.orElseThrow(); // getting the key
//				System.out.println(orElseThrow3);
		    
		


//				Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Employee1::getAge,Collectors.counting()));
//
//				Optional<Entry<Integer, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
//	            System.out.println(max);
	            
//        List<Employee1> collect = list.stream().sorted((n1,n2)->Double.compare(n1.getSalary(), n2.getSalary())).toList();
//
//	            System.out.println();
//	            long count =collect.stream().count();
//	            if(count%2==0)
//	            {
//	            	   double salary = collect.get((int)(count/2-1)).getSalary();
//	            	   double salary2 = collect.get((int)(count/2)).getSalary();
//	            	   double avg=(salary+salary2)/2;
//	            	   System.out.println(avg);
//	            }
//	            else {
//	            	    double salary = collect.get((int)(count/2-1)).getSalary();
//	            	    System.out.println(salary);
//				}
		
		
//		Stream<Employee1> sorted = list.stream().sorted(Comparator.comparingInt(Employee1::getAge)
//		.thenComparing(Comparator.comparingDouble(Employee1::getSalary).reversed()));
//        sorted.forEach(System.out::println);

//        Map<String, Optional<Employee1>> collect = list.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))));
//        System.out.println(collect);
		
//		List<String> collect = list.stream().map(s->s.getName()).distinct().collect(Collectors.toList());
//		System.out.println(collect);
		
		
//		Map<Integer, Optional<Employee1>> collect = list.stream().collect(Collectors.groupingBy(d->d.getAge(),Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))));
//		Map<Integer, Optional<Employee1>> collect1 = list.stream().collect(Collectors.groupingBy(d->d.getAge(),Collectors.minBy(Comparator.comparingDouble(Employee1::getSalary))));
//		Set<Entry<Integer, Optional<Employee1>>> entrySet = collect.entrySet();
//		Iterator<Entry<Integer, Optional<Employee1>>> iterator = entrySet.iterator();
//		Set<Entry<Integer, Optional<Employee1>>> entrySet2 = collect1.entrySet();
//		Iterator<Entry<Integer, Optional<Employee1>>> iterator2 = entrySet2.iterator();
//		while(iterator.hasNext() || iterator2.hasNext())
//		{
//			Entry<Integer, Optional<Employee1>> next = iterator.next();
//			Entry<Integer, Optional<Employee1>> next2 = iterator2.next();
//			System.out.println("max value "+next.getValue()+" min value "+next2.getValue());
//		}
		
//		Map<Integer, Set<Double>> collect = list.stream().collect(Collectors.groupingBy(Employee1::getAge,Collectors.mapping(Employee1::getSalary, Collectors.toSet())));
//		System.out.println(collect);
		
		
//		Employee1 Employee9 = list.stream()
//				.filter(k-> k.getAge()==list.stream().mapToInt(Employee1::getAge).max().orElseThrow())
//				.min(Comparator.comparingDouble(Employee1::getSalary)).get();
//				System.out.println(Employee9);
		
//		Map<String, Optional<Employee1>> e = list.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.maxBy((j,j1)->Double.compare(j.getSalary(), j1.getSalary()))));
//
//		Set<Entry<String, Optional<Employee1>>> entrySet = e.entrySet();
//		Iterator<Entry<String, Optional<Employee1>>> iterator = entrySet.iterator();
//		while(iterator.hasNext())
//		{
//			Entry<String, Optional<Employee1>> next = iterator.next();
//			System.out.println(next.getKey()+" "+next.getValue());
//		}
		
//		Set<Entry<String, Long>> entrySet = list.stream().collect(Collectors.groupingBy(Employee1::getName,Collectors.counting()))
//		.entrySet();
//		Stream<Entry<String, Long>> filter = entrySet.stream().filter(s->s.getValue()==1);
//         filter.forEach(System.out::println);

		
//		Map<Integer,Map<String,Double>> collect5 = list.stream()
//				.collect(Collectors.groupingBy(Employee1::getAge,
//						Collectors.collectingAndThen(Collectors.toList(), k ->
//				{
//					Double maxx = k.stream().mapToDouble(k2->k2.getSalary()).max().getAsDouble();
//					Double min = k.stream().mapToDouble(k1->k1.getSalary()).min().getAsDouble();
//					Map<String, Double> map =  new HashMap<>();
//					map.put("max", maxx);
//					map.put("min", min);
//					return map;
//					
//				})));
//				collect5.forEach((age,map)->
//				{
//					System.out.print("Age : "+age+" - ");
//					System.out.println("Minimum : "+map.get("min")+" Maximum : "+map.get("max"));
//				});

		
//		Double double1 = list.stream()
//				.collect(Collectors.groupingBy(Employee1::getSalary , Collectors.counting()))
//				.entrySet()
//				.stream()
//				.max(Map.Entry.comparingByValue())
//				.map(Map.Entry::getKey).get();
//				System.out.println(double1);

		
//		Optional<Employee1> max = list.stream().max((z,z1)->Integer.compare(z.getAge(), z1.getAge()))
//         .stream().max((s,s1)->Double.compare(s.getSalary(), s1.getSalary()));
//		System.out.println(max);
		
//		list.stream().filter(s->
//		{
//			String lowerCase = s.getName().toLowerCase();
//			StringBuffer sBuffer=new StringBuffer(lowerCase);
//		    return lowerCase.contentEquals(sBuffer.reverse());
//		}).forEach(w->System.out.println(w));
		
		
//		Stream<Employee1> filter = list.stream().filter(l->l.getAge()%2==1);
//		
//		double sum = filter.mapToDouble(Employee1::getSalary).sum();
//		System.out.println(sum);
//		
		
//		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//		list1.stream().map(k -> k*2+3-k).forEach(k -> System.out.print(k +" "));

//		List<String> words = Arrays.asList();
//		String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElse("NULL");
//		System.out.println(result);

//		List<Integer> list1 = List.of(54,34,234,23,364,3);
//		list1.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
//		.forEach(k -> System.out.print(k - 10 + " "));

		 List mylist = new ArrayList();
	        int[] val = {15, 5565, 646, 233, 100};
	        for (int element : val)
	            mylist.add(new Integer(element));
	        System.out.println(mylist);
	        Iterator iterator = mylist.iterator();
	        int i = mylist.size();  //i = 
	        while (iterator.hasNext()) {
	            Integer element = (Integer) iterator.next();
	            int value = element.intValue();
	          
	            i--;
	            
	            if ((value < 100) || mylist.get(i).equals(100))
	                iterator.remove();
	               
	        }
	        System.out.println(mylist);
	    

		
		
		
		
	}
	
	


}
