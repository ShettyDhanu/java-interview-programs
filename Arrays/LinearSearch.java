Check if number 18 exist in a array
    /*
Program: Linear Search
Concepts:
1. Arrays
2. for loop
3. if condition
4. boolean flag
5. break
*/

int[] numbers = {25, 10, 45, 18, 32};

int target = 18;

for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] == target) {
        System.out.println("18 exists");
break;
    }

}
