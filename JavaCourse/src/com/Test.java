package com;

public final class Test {


	
	
	public static void main(String[] args) {
		
		byte b = 100;
		
		Integer intBytes = new Integer(b).BYTES;
		System.out.println(intBytes);
		
		int longBytes = new Long(b).BYTES;
		System.out.println(longBytes);
		
		boolean equals = intBytes.equals(longBytes);
		System.out.println(equals);
		
		
		/*
		int [] arr = {34, 45,34,45,56,67,67,89,89,73,65,45,34,20,20,34,34,20,72,73};
		
		Map<Integernum,Integercount> map = new HashMap<>();


		for(Integer num: arr) {
		    
		    if(map.containsKey(num)) {
		    	int c = map.get(num);
		        map.put(num,++c);
		    } else {
		        map.put(num,1);
		        
		    }
		}
		
//		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//			@Override
//			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
//				return 0;
//			}
//		});		
		
		 Map<Integer, Integer> map2 = map.entrySet().stream().sorted((o1,o2)->o2.getValue()-o1.getValue()).collect(Collectors.toMap(x->x.getKey(), y->y.getValue(), (e1,e2) -> e1, LinkedHashMap::new));
	
		 System.out.println(map2);
	*/
		
	
	}
	
	
	

}



