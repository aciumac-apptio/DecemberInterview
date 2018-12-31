import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  int[] array = {5,7,7,8,8,10};
        System.out.println(searchRange(array, 7));*/

        System.out.println(numberSwapper(123));
        String[] wrds = {"john", "james", "tree", "used"};
        List<String> words = Arrays.asList(wrds);
        System.out.println(possibleWords(8733, words));


/*        int[][] input = new int[6][6];
        int[] row0 = {-9, -9, -9, 1, 1, 1};
        int[] row1 = {0, -9, 0, 4, 3, 2};
        int[] row2 = {-9, -9, -9, 1, 2, 3};
        int[] row3 = {0, 0, 8, 6, 6, 0};
        int[] row4 = {0, 0, 0, -2, 0, 0};
        int[] row5 = {0, 0, 1, 2, 4, 0};

        input[0] = row0;
        input[1] = row1;
        input[2] = row2;
        input[3] = row3;
        input[4] = row4;
        input[5] = row5;

        System.out.println(hourglassSum(input));*/

        /*System.out.println("Expect 4 Actual " + sherlockAndAnagrams("abba"));
        System.out.println("Expect 0 Actual " + sherlockAndAnagrams("abcd"));
        System.out.println("Expect 3 Actual " + sherlockAndAnagrams("ifailuhkqq"));
        System.out.println("Expect 10 Actual " + sherlockAndAnagrams("kkkk"));*/
        System.out.println("Expect 166650 Actual " + sherlockAndAnagrams("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

        List<Long> arr = new ArrayList<>();
        long[] a = {1, 3, 9, 9, 27, 81};
        //long[] a = {1, 3, 9, 9, 27, 81};
        for (int i = 0; i < 100; i++) {
            arr.add((long) 1);
        }

        System.out.println(countTriplets(arr, 1));
        System.out.println(nonRepeated("initialization"));
        System.out.println(getIntegerComplement(50));


        List<Integer> lst = new ArrayList<>();
        int[] ex = {13, 10, 21, 20};
        for (int i : ex) {
            lst.add(i);
        }
        System.out.println(moves(lst));


        int[][] input = new int[6][8];
        int[] row0 = {1,   2,  3,  4,  5,  6,  7,  8};
        int[] row1 = {9,  10, 11, 12, 13, 14, 15, 16};
        int[] row2 = {17, 18, 19, 20, 21, 22, 23, 24};
        int[] row3 = {25, 26, 27, 28, 29, 30, 31, 32};
        int[] row4 = {33, 34, 35, 36, 37, 38, 39, 40};
        int[] row5 = {41, 42, 43, 44, 45, 46, 47, 48};

        input[0] = row0;
        input[1] = row1;
        input[2] = row2;
        input[3] = row3;
        input[4] = row4;
        input[5] = row5;


        int[][] input2 = new int[3][3];
        int[] row6 = {1, 2, 3};
        int[] row7 = {4, 5, 6};
        int[] row8 = {7, 8, 9};
        input2[0] = row6;
        input2[1] = row7;
        input2[2] = row8;


        int[][] input3 = new int[10][1];
        int[] row9 =  {1};
        int[] row10 = {2};
        int[] row11 = {3};
        int[] row12 = {4};
        int[] row13 = {5};
        int[] row14 = {6};
        int[] row15 = {7};
        int[] row16 = {8};
        int[] row17 = {9};
        int[] row18 = {10};

        input3[0] = row9;
        input3[1] = row10;
        input3[2] = row11;
        input3[3] = row12;
        input3[4] = row13;
        input3[5] = row14;
        input3[6] = row15;
        input3[7] = row16;
        input3[8] = row17;
        input3[9] = row18;

        System.out.println(spiralOrder(input3));

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

        System.out.println(climbStairs(5));
        System.out.println(smallestString(4));

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        x.add(1); x.add(1); x.add(2);
        y.add(1); y.add(2); y.add(1);

        System.out.println(minArea(x, y, 3));


        System.out.println(minWindow("abc", "ac"));
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("ABAACBAB", "AABC"));

        int[] nms = {1, 2, 3};
        //System.out.println(subsets(nms));
        int[] nms1 = {-1, 1, 2};
        //System.out.println(subsets(nms1));
        int[] nms2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        System.out.println(subsets(nms2));
    }


    public static List<List<Integer>> subsets(int[] nums) {
        Set<Set<Integer>> setOfSets = new HashSet<>();
        Set<Integer> choices = new HashSet<>();
        for (int val : nums) {
            choices.add(val);
        }
        Set<Integer> currentSet = new HashSet<>();
        subsets(currentSet, setOfSets, choices);
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (Set<Integer> set : setOfSets) {

            List<Integer> list = new ArrayList<>();
            for (int val : set) {
                list.add(val);
            }
            listOfLists.add(list);
        }

        return listOfLists;
    }


    private static void subsets(Set<Integer> current, Set<Set<Integer>> setOfSets, Set<Integer> choices) {
        setOfSets.add(new HashSet<>(current));
        if (!choices.isEmpty() ) {
            Set<Integer> copyOfChoices = new HashSet<>(choices);
            for (int value : choices) {
                current.add(value);
                copyOfChoices.remove(value);

                subsets(current, setOfSets, copyOfChoices);

                copyOfChoices.add(value);
                current.remove(value);
            }
        }
    }



    public static String minWindow(String s, String t) {

        // Iterate through all substrings of size t.length -> s.length() - 1
        String chosen = "";
        int left = 0;
        int right = 0;


        // We use the right pointer to expand the window until we get a desirable window i.e. a window that contains all of the characters of T.
        while (right <= s.length()) {
            if (containsAllChars(t, s.substring(left, right))) {
                do {
                    left++;

                } while (left <= right && containsAllChars(t, s.substring(left, right)));

                if (chosen.isEmpty() || chosen.length() > s.substring(left - 1, right).length()) {
                    chosen = s.substring(left - 1, right);
                }

            }
            right++;
        }

        if (chosen.isEmpty()) {
            return "";
        }

        return chosen;
    }

    private static boolean containsAllChars(String t, String s) {
        StringBuilder sb = new StringBuilder(s);
        for (char c : t.toCharArray()) {
            int index = sb.indexOf(c + "");
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }


    public static class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class XComparator implements Comparator<Point> {
        public int compare(Point a, Point b) {
            if (a.x < b.x) {
                return -1;
            } else {
                return a.x == b.x ? 0 : 1;
            }
        }
    }

    private static class YComparator implements Comparator<Point> {
        public int compare(Point a, Point b) {
            if (a.y < b.y) {
                return -1;
            } else {
                return a.y == b.y ? 0 : 1;
            }
        }
    }

    public static long minArea(List<Integer> x, List<Integer> y, int k) {
        // Write your code here
        List<Point> coords = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            coords.add(new Point(x.get(i), y.get(i)));
        }

        Collections.sort(coords, new XComparator());
        int minX = coords.get(0).x;
        int maxX = coords.get(k - 1).x;

        Collections.sort(coords, new YComparator());
        int minY = coords.get(0).y;
        int maxY = coords.get(k - 1).y;

        int ySide = maxY - minY + 2;
        int xSide = maxX - minX + 2;

        return ySide >= xSide ? ySide * ySide : xSide *xSide;
    }

    public static String smallestString(long weight) {
        // Write your code here
        // Build a map of weights
        Map<Character, Integer> charsToWeight = new HashMap<>();
        List<Character> possibleChars = new ArrayList<>();

        int coeff = 1;
        int sum = 1;
        int chVal = 65;

        while (sum <= weight && chVal < 91) {
            possibleChars.add((char) chVal);
            charsToWeight.put((char) chVal, sum);
            chVal++;
            coeff++;
            sum = coeff * charsToWeight.get((char) (chVal - 1)) + coeff;
        }

        // A->1, B -> 4, C -> 15
        Set<String> set = new HashSet<>();
        String shortest = possibleStrings(weight, "", "", possibleChars, charsToWeight);

        char[] arr = shortest.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    private static String possibleStrings(long weight, String current, String shortest, List<Character> possibleChars, Map<Character, Integer> charsToWeight) {
        if (weight == 0) {
            if (shortest.isEmpty() || current.length() < shortest.length()) {
                shortest = current;
            }
        } else if(weight > 0) {
            for (int i = possibleChars.size() - 1; i >= 0; i--) {
                char c = possibleChars.get(i);
                shortest = possibleStrings(weight - charsToWeight.get(c), current + c, shortest, possibleChars, charsToWeight);
            }
        }
        return shortest;
    }



    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }


    public static int trap(int[] height) {
/*        int sum = 0;
        int startIndex;
        int endIndex;
        int level = 0;

        while(true) {
            startIndex = 0;
            endIndex = height.length - 1;
            while (startIndex < height.length && height[startIndex] - level <= 0) {
                startIndex++;
            }

            while (endIndex > startIndex && height[endIndex] - level <= 0) {
                endIndex--;
            }

            if (startIndex > endIndex) {
                break;
            }

            for (int i = startIndex + 1; i < endIndex; i++) {
                if (height[i] <= level) {
                    sum++;
                }
            }

            level++;
        }*/


        //Dynamic
        if (height.length == 0) {
            return 0;
        }

        int sum = 0;
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];

        left_max[0] = height[0];
        right_max[height.length-1] = height[height.length-1];

        for (int i = 1; i < height.length; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i]);
        }

        for (int i = height.length- 2; i>= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            sum += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return sum;

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        // [1,   2,  3,  4,  5,  6,  7,  8],
        // [9,  10, 11, 12, 13, 14, 15, 16],
        // [17, 18, 19, 20, 21, 22, 23, 24],
        // [25, 26, 27, 28, 29, 30, 31, 32],
        // [33, 34, 35, 36, 37, 38, 39, 40],
        // [41, 42, 43, 44, 45, 46, 47, 48]

        //Round 1

        // top row [0][0], [0][1], [0][2], [0][3], [0][4], [0][5], [0][6], [0][7],
        // right side [1][7], [2][7], [3][7], [4][7], [5][7]
        // bottom row  backwards [5][6], [5][5], [5][4], [5][3], [5][2], [5][1], [5][0]
        // left side [4][0], [3][0], [2][0], [1][0]

        //Round 2
        // top row  [1][1], [1][2], [1][3], [1][4], [1][5], [1][6]
        // right side  [2][6], [3][6], [4][6]
        // bottom row  backwards [4][5], [4][4], [4][3], [4][2], [4][1]
        // left side [3][1], [2][1]

        //Round 3
        //top row [2][2], [2][3], [2][4], [2][5] done
        //right side [3,5]
        //bottom row [3,4], [3,3]
        // no left side

        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int round = 0;
        int count = 0;
        while (count < matrix[0].length * matrix.length && round <= matrix.length / 2) {
            // print top row
            for (int i = round; i < matrix[round].length - round; i++) {
                list.add(matrix[round][i]);
                count++;
            }

            // right side
            for (int i = round + 1; i < matrix.length - round; i++) {
                list.add(matrix[i][matrix[i].length - 1 - round]);
                count++;
            }

            // backwards row
            if (count < matrix[0].length * matrix.length) {
                for (int i = matrix[matrix.length - 1 - round].length - 2 - round; i >= round; i--) {
                    list.add(matrix[matrix.length - 1 - round][i]);
                    count++;
                }
                //left side
                for (int i = matrix.length - 2 - round; i >= round + 1; i--) {
                    list.add(matrix[i][round]);
                    count++;
                }
            }

            round++;
        }

        return list;
    }


    public static int moves(List<Integer> a) {
        // Write your code here
        // [6, 3, 4, 5, 8, 9, 10, 11]
        // 6 is even - ok
        // 3 is odd -> ok if the rest of the numbers are odd (remember where the odd element is)
        // 4 is even -> and odd element 3 (index 1) is present
        // swap
        // moves++
        // [6, 4, 3, 5, 8, 9, 10, 11]
        // start at index 1 (first odd)
        // 5 is odd -> ok if the rest are odd
        // 8 is even -> and odd element 3 (index 2) is present
        // swap
        // moves++
        // [6, 4, 8, 5, 3, 9, 10, 11]
        // start again from index 3
        // 5 is odd - ok if the rest are odd
        // 3 is odd - ok if the rest are odd
        // 9 is odd - ok if the rest are odd
        // 10 is even - and odd element 5 (index 3) is present
        // swap
        // moves++
        // [6, 4, 8, 10, 3, 9, 5, 11]
        // start at index 4 (first odd)
        // 3 is odd
        // 9 is odd
        // 5 is odd
        // 11 is odd

        // done

        // code
        // store the number of moves
        int moves = 0;
        int oddIndex = -1;
        int i = 0;
        // store the index of the first odd number encountered = -1;
        while (i < a.size()) {
            // if even and no odd numbers behind advance the i
            // else if even but odd number behind -> swap with the odd number, moves++, reset the i to index of the odd number (old) and advance i
            if (oddIndex == -1 && a.get(i) % 2 != 0) {
                oddIndex = i;
            } else if (oddIndex >= 0 && i > oddIndex && a.get(i) % 2 == 0) {
                int temp = a.get(i);
                a.set(i, a.get(oddIndex));
                a.set(oddIndex, temp);
                moves++;
                oddIndex = i;
            }

            i++;
        }

        return moves;
    }

    public static int getIntegerComplement(int n) {
        // Write your code here
        // convert n to a binaryString 110010
        if (n == 0) {
            return 1;
        }


        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            if (n % 2 == 0) {
                sb.insert(0, "0");

            } else {
                sb.insert(0, "1");

            }

            n /= 2;
        }

        // invert binaryString 001101
        String binaryString = sb.toString();
        binaryString = binaryString.replaceAll("1", "_");
        binaryString = binaryString.replaceAll("0", "1");
        binaryString = binaryString.replaceAll("_", "0");



        // convert from binaryString to n
        double result = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                double val = Math.pow(2, binaryString.length() - i - 1);
                result = result + val;
            }

        }

        return (int) result;

    }

    public static String nonRepeated(String s) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int val = 1;
            if (map.containsKey(c)) {
                val = map.get(c);
            }
            map.put(c, ++val);
        }

        String nonRepeat = "";
        for (char c : s.toCharArray()) {
            int val = map.get(c);
            if (val == 1) {
                return nonRepeat + c;
            }
        }
        return nonRepeat;

    }

    public static long countTriplets(List<Long> arr, long r) {
        List<Long> choice = new ArrayList<>();

        long count = countTriplets(arr, r, choice, (long)0);
        return count;
    }

    private static long countTriplets(List<Long> choices, long r, List<Long> choice, long count) {
        if (choice.size() == 3) {
            count++;
        } else {
            for (int i = 0; i < choices.size(); i++) {
                long value = choices.get(i);
                if (choice.isEmpty() || value == choice.get(choice.size() - 1) * r) {
                    // choose

                    choice.add(value);
                    choices.remove(i);
                    // explore
                    count = countTriplets(choices, r, choice, count);

                    // unchoose
                    choice.remove(choice.size() - 1);
                    choices.add(i, value);
                }
            }

        }
        return count;
    }


    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> strToNum = new HashMap<>();
        // build anagrams
        int substrLength = 1;
        while (substrLength < s.length()) {
            for (int i = 0; i <= s.length() - substrLength; i++) {
                char[] anagram = s.substring(i, i + substrLength).toCharArray();
                Arrays.sort(anagram);
                String key = new String(anagram);
                int val = 0;
                if (strToNum.containsKey(key)) {
                    val = strToNum.get(key);
                }
                strToNum.put(key, ++val);
            }
            substrLength++;
        }

        int anagramNumber = 0;
        for (String anagram : strToNum.keySet()) {
            int val = strToNum.get(anagram);
            if (val != 1) {
                //anagramNumber += (val / 2);
                //long n = factorial(val);
                //long pairs = n / (2 * factorial(val - 2));
                anagramNumber += numOfPairs(val);
            }
        }
        return anagramNumber;
    }

    private static int numOfPairs(int n) {
        if (n == 0) return 1;

        int sum = 1;
        for (int i = n; i > n - 2; i--) {
            sum *= i;
        }
        return sum / 2;
    }


    public static int hourglassSum(int[][] arr) {

        //row 0
        // arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2]
        // arr[0][1] + arr[0][2] + arr[0][3] + arr[1][2] + arr[2][1] + arr[2][2] + arr[2][3]
        // arr[0][2] + arr[0][3] + arr[0][4] + arr[1][3] + arr[2][2] + arr[2][3] + arr[2][4]
        // arr[0][3] + arr[0][4] + arr[0][5] + arr[1][4] + arr[2][3] + arr[2][4] + arr[2][5]
        // arr[0][4] + arr[0][5] + arr[0][6] + arr[1][5] + arr[2][4] + arr[2][5] + arr[2][6]
        //row 1
        // arr[1][0] + arr[1][1] + arr[1][2] + arr[2][1] + arr[3][0] + arr[3][1] + arr[3][2]
        // arr[1][1] + arr[1][2] + arr[1][3] + arr[2][2] + arr[3][1] + arr[3][2] + arr[3][3]
        // arr[1][2] + arr[1][3] + arr[1][4] + arr[2][3] + arr[3][2] + arr[3][3] + arr[3][4]
        // arr[1][3] + arr[1][4] + arr[1][5] + arr[2][4] + arr[3][3] + arr[3][4] + arr[3][5]
        // arr[1][4] + arr[1][5] + arr[1][6] + arr[2][5] + arr[3][4] + arr[3][5] + arr[3][6]


        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - 2; row++) {
            int sum = 0;
            for (int col = 1; col < arr.length - 1; col++) {
                sum = arr[row][col - 1] + arr[row][col] + arr[row][col + 1] + arr[row + 1][col] + arr[row + 2][col - 1] + arr[row + 2][col] + arr[row + 2][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }


        }

        return maxSum;

    }

    public static List<String> possibleWords(int input, List<String> words) {
        Map<Character, Integer> phone = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrtuvwxy";
        int digit = 1;
        for (int i = 0; i < alphabet.length(); i++) {
            if (i % 3 == 0) {
                digit++;
            }

            phone.put(alphabet.charAt(i), digit);
        }

        phone.put('s', 7);
        phone.put('z', 9);

        List<String> possibleList = new ArrayList<>();
        for (String word : words) {
            if (word.length() == String.valueOf(input).length()) {
                int value = input;
                for (int i = word.length() - 1; i >= 0; i--) {
                    if (phone.get(word.charAt(i)) != value % 10) {
                        break;
                    }
                    value /= 10;
                }
                if (value == 0) {
                    possibleList.add(word);
                }
            }
        }
        return possibleList;
    }


    public static int numberSwapper(int value) {
        return numberSwapper(value, 0);
    }

    private static int numberSwapper(int value, int swappedValue) {
        if (value == 0) {
            return swappedValue;
        } else {
            return numberSwapper(value / 10, swappedValue * 10 + value % 10);
        }


    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int leftIndex = rank(target, nums, true);
        if (leftIndex == -1) {
            return result;
        }

        result[0] = leftIndex;
        result[1] = rank(target, nums, false);

        return result;

    }

    private static int rank(int key, int[] a, boolean left) {
        int lo = 0;
        int hi = a.length - 1;

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (left && key == a[mid]) hi = mid;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }
}
