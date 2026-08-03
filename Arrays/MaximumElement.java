int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (numbers[i] > max) {
        max = numbers[i];
    }

}

System.out.println(max);
