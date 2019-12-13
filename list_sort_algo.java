	public static List<Integer> sort(List<Integer> numbers) {
		for (int j = 1; j < numbers.size()-1; j++) {
			for (int i = 0; i < numbers.size()-1; i++) {
				if (numbers.get(i) > numbers.get(i+1)) {
					int x = numbers.get(i+1) + numbers.get(i);
					int y = x - numbers.get(i);	//number.get(1) == y
					x = x - numbers.get(i+1);     //number.get(0) == x
					numbers.set(i, y);
					numbers.set(i+1, x);
				}
			}
		}
		return numbers;
	}
