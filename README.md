## Automatic repair experiment on QuixBugs.

This experiment is to evaluate effectiveness of two representative automatic repair tools Astor and Nopol on repairing [QuixBugs](https://github.com/jkoppel/QuixBugs) benchmark. QuixBugs is a benchmark suite of 40 confirmed bugs from classic algorithms with a bug on a single line of code. Before we start our experiment, we did some [preperation work](https://github.com/jkoppel/QuixBugs/pulls?q=is%3Apr+is%3Aclosed) to contribute QuixBugs as a usable repair benchmark in Java programs.



### Folder Structure

* [Buggy Java Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/buggy_java_programs) are 40 buggy programs from QuixBugs and Corresponding [Junit Tests](https://github.com/KTH/quixbugs-experiment/tree/master/src/test/java/buggy_java_programs)

* [Reference Programs](https://github.com/KTH/quixbugs-experiment/tree/master/src/main/java/java_programs) are the ground truth version based on the provided correct Python version from QuixBugs.

* [Patches](https://github.com/KTH/quixbugs-experiment/tree/master/patches) contains all patches generated by Astor, Nopol, Arja, RSRepair and NPEFix.

* [Evosuite Tests and InputSampling Tests](https://github.com/KTH/quixbugs-experiment/tree/master/generatedTests) are the independent tests generated based reference programs, to assess patches generated by Astor and Nopol. 

* [Patch Correctness Assessment](https://github.com/KTH/quixbugs-experiment/tree/master/assessment_report) are the assessment reports of each patch when running different number tests.

* [log](https://github.com/KTH/quixbugs-experiment/tree/master/log) contains all the patch generation logs.

### Getting started

##### Check out the project:

```
git clone https://github.com/KTH/quixbugs-experiment.git
cd quixbugs-experiment
mvn clean install -DskipTests
```

##### Patch correctness assessment:

To assess patches ,for example, by using 30 Evosuite test suites:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#testResultsByRunning30Seeds

```
To assess patches ,for example, by using 300 InputSampling tests:

```
java -cp /path/to/junit-4.9.jar org.junit.runner.JUnitCore qfevotest.generator.PatchAssessmentTest#inputSampling_300_assessment
```

### Test Coverage 
* [QuixBugs_original_tests](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/original_tests/index.html)

* [Evosuite](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/Evosuite/index.html)

* [InputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSampling/index.html)

* [EvosuiteAndInputSampling](http://htmlpreview.github.io/?https://github.com/KTH/quixbugs-experiment/blob/master/code_coverage/InputSamplingAndEvosuite/index.html)


### Reference Patches

* BITCOUNT
```Java
@@ -12,7 +13,7 @@
     public static int bitcount(int n) {
     int count = 0;
     while (n != 0) {
-        n = (n ^ (n - 1));
+        n = (n & (n - 1));
         count++;
     }
     return count;

```

* BREADTH_FIRST_SEARCH
```Java
@@ -21,7 +21,7 @@
 
         nodesvisited.add(startnode);
 
-        while (true) {
+        while (!queue.isEmpty()) {
             Node node = queue.removeFirst();
 
             if (node == goalnode) {
@@ -39,7 +39,7 @@
          * The buggy program always drops into while(true) loop and will not return false
          * Removed below line to fix compilation error
          */
-        // return false;
+         return false;
     }
 
 }

```

* BUCKETSORT
```Java
@@ -19,7 +19,7 @@
 
         ArrayList<Integer> sorted_arr = new ArrayList<Integer>(100);
 	int i = 0;
-        for (Integer count : arr) { // arr is counts in fixed version
+        for (Integer count : counts) { 
 	    sorted_arr.addAll(Collections.nCopies(count, i));
 	    i++;
         }

```

* DEPTH_FIRST_SEARCH
```Java
@@ -19,6 +21,7 @@
                 } else if (node == goalnode) {
                     return true;
                 } else {
+                  	nodesvisited.add(node);
                     for (Node successornodes : node.getSuccessors()) {
 	                    if (search(successornodes)) { return true; }
                     }


```


* DETECT_CYCLE
```Java
@@ -15,7 +17,7 @@
         Node tortoise = node;
 
         while (true) {
-            if (hare.getSuccessor() == null)
+            if (null==hare ||hare.getSuccessor() == null)
                 return false;
 
             tortoise = tortoise.getSuccessor();

```


* FIND_FIRST_IN_SORTED
```Java
@@ -16,7 +16,7 @@
         int lo = 0;
         int hi = arr.length;
 
-        while (lo <= hi) {
+        while (lo < hi) {
             int mid = (lo + hi) / 2; // check if this is floor division
 
             if (x == arr[mid] && (mid == 0 || x != arr[mid-1])) {
```

* FIND_IN_SORTED
```Java
@@ -17,7 +18,7 @@
         if (x < arr[mid]) {
             return binsearch(arr, x, start, mid);
         } else if (x > arr[mid]) {
-            return binsearch(arr, x, mid, end);
+            return binsearch(arr, x, mid+1, end);
         } else {
             return mid;
         }

```


* FLATTEN
```Java
@@ -18,12 +19,12 @@
                 if (x instanceof ArrayList) {
                     result.addAll((ArrayList) flatten(x));
                 } else {
-                    result.add(flatten(x));
+                    result.add((x));
 		}
             }
             return result;
 	} else {
-	    return flatten(arr);
+	    return arr;
 	}
     }
 }

```

* GCD
```Java
@@ -16,7 +16,7 @@
         if (b == 0) {
             return a;
         } else {
-            return gcd(a % b, b);
+            return gcd(b, a%b);
         }
     }
 }
```

* GET_FACTORS
```Java
@@ -24,6 +24,6 @@
                 return prepend;
             }
         }
-        return new ArrayList<Integer>();        
+        return new ArrayList<Integer>(Arrays.asList(n));
     }
 }

```

* HANOI
```Java
@@ -24,7 +24,7 @@
             crap_set.remove(end);
             int helper = crap_set.poll();
             steps.addAll(hanoi(height-1, start, helper));
-            steps.add(new Pair<Integer,Integer>(start, helper));
+            steps.add(new Pair<Integer,Integer>(start, end));
             steps.addAll(hanoi(height-1, helper, end));
         }
```

* IS_VALID_PARENTHESIZATION
```Java
@@ -21,6 +22,6 @@
 		if (depth < 0) { return false; }
 	    }
 	}
-	return true;
+	return depth==0;
     }
 }
```

* KHEAPSORT
```Java
@@ -24,7 +25,7 @@
         }
 
         ArrayList<Integer> output = new ArrayList<Integer>();
-        for (Integer x : arr) {
+        for (Integer x : arr.subList(k, arr.size())) {
             heap.add(x);
             Integer popped = heap.poll();
             output.add(popped);
```

* KNAPSACK
```Java
@@ -27,7 +28,7 @@
                 if (i == 0 || j == 0) {
                     memo[i][j] = 0;
                 }
-                else if (weight < j) {
+                else if (weight <= j) {
                     memo[i][j] = Math.max(memo[i - 1][j], value + memo[i - 1][j - weight]);
                 }
                 else {
```
* KTH
```Java
@@ -22,7 +29,7 @@
         if (k < num_less) {
             return kth(below, k);
         } else if (k >= num_lessoreq) {
-            return kth(above, k);
+            return kth(above, k-num_lessoreq);
         } else {
             return pivot;
         }
```
* LCS_LENGTH
```Java
@@ -32,9 +32,10 @@
             for (int j=0; j < t.length(); j++) {
                 if (s.charAt(i) == t.charAt(j)) {
 
-                    if (dp.containsKey(i-1)) {)
+                    if (dp.containsKey(i-1)&&dp.get(i-1).containsKey(j-1)) {
                         Map<Integer, Integer> internal_map = dp.get(i);
-                        int insert_value = dp.get(i-1).get(j) + 1;
+                        int insert_value = dp.get(i-1).get(j-1) + 1;
                         internal_map.put(j, insert_value);
                         dp.put(i,internal_map);
                     } else {
```
* LEVENSHTEIN
```Java
@@ -14,7 +14,7 @@
         if (source.isEmpty() || target.isEmpty()) {
             return source.isEmpty() ? target.length() : source.length();
         } else if (source.charAt(0) == target.charAt(0)) {
-            return 1 + levenshtein(source.substring(1), target.substring(1));
+            return levenshtein(source.substring(1), target.substring(1));
         } else {
             return 1 + Math.min(Math.min(
                     levenshtein(source,              target.substring(1)),
```
* LIS
```Java
@@ -28,7 +28,7 @@
 
             if (length == longest || val < arr[ends.get(length+1)]) {
                 ends.put(length+1, i);
-                longest = length + 1;
+                longest = Math.max(longest,length + 1);
             }
 
             i++;
```
* LONGEST_COMMON_SUBSEQUENCE
```Java
@@ -15,7 +15,7 @@
         if (a.isEmpty() || b.isEmpty()) {
             return "";
         } else if (a.charAt(0) == b.charAt(0)) {
-            return a.charAt(0) + longest_common_subsequence(a.substring(1), b);
+            return a.charAt(0) + longest_common_subsequence(a.substring(1), b.substring(1));
         } else {
             String fst = longest_common_subsequence(a, b.substring(1));
             String snd = longest_common_subsequence(a.substring(1), b);
```
* MAX_SUBLIST_SUM 
```Java
@@ -16,7 +16,7 @@
         int max_so_far = 0;
 
         for (int x : arr) {
-            max_ending_here = max_ending_here + x;
+            max_ending_here = Math.max(0,max_ending_here + x);
             max_so_far = Math.max(max_so_far, max_ending_here);
         }
 
```
* MERGESORT
```Java
@@ -35,7 +35,7 @@
     }
 
     public static ArrayList<Integer> mergesort(ArrayList<Integer> arr) {
-        if (arr.size() == 0) { // <= 1 in correct version
+        if (arr.size() <= 1) { // <= 1 in correct version
             return arr;
         } else {
             int middle = arr.size() / 2;
```
* NEXT_PALINDROME
```Java
@@ -32,7 +32,7 @@
 
         ArrayList<Integer> otherwise = new ArrayList<Integer>();
 	otherwise.add(1);
-	otherwise.addAll(Collections.nCopies(digit_list.length, 0));
+	otherwise.addAll(Collections.nCopies(digit_list.length-1, 0));
 	otherwise.add(1);
 
         return String.valueOf(otherwise);
```
* NEXT_PERMUTATION
```Java
@@ -16,7 +16,7 @@
         for (int i=perm.size()-2; i!=-1; i--) {
             if (perm.get(i) < perm.get(i+1)) {
                 for (int j=perm.size()-1; j!=i; j--) {
-                    if (perm.get(j) < perm.get(i)) {
+                    if (perm.get(j) > perm.get(i)) {
                         ArrayList<Integer> next_perm = perm;
                         int temp_j = perm.get(j);
                         int temp_i = perm.get(i);
```
* PASCAL
```Java
@@ -19,7 +19,7 @@
 
         for (int r=1; r<n; r++) {
             ArrayList<Integer> row = new ArrayList<Integer>();
-            for (int c=0; c<r; c++) {
+            for (int c=0; c<r+1; c++) {
                 int upleft, upright;
                 if (c > 0) {
                     upleft = rows.get(r-1).get(c-1);
```
* POSSIBLE_CHANGE
```Java
@@ -14,7 +14,7 @@
         if (total == 0) {
             return 1;
         }
-        if (total < 0) {
+        if (total < 0 ||coins.length==0) {
             return 0;
         }
```
* POWERSET
```Java
@@ -20,13 +20,17 @@
 
             ArrayList<ArrayList> output = new ArrayList<ArrayList>(100);
             ArrayList to_add = new ArrayList(100);
-            to_add.add(first);
+
             for (ArrayList subset : rest_subsets) {
-                to_add.addAll(subset);
+            		ArrayList r = new ArrayList();
+				r.add(first);
+				r.addAll(subset);
+				to_add.add(r);
             }
-            output.add(to_add);
+            output.addAll(to_add);
+            rest_subsets.addAll(output);
 
-            return output;
+            return rest_subsets;
         } else {
             ArrayList empty_set = new ArrayList<ArrayList>();
             empty_set.add(new ArrayList());

```
* QUICKSORT
```Java
@@ -23,7 +23,7 @@
         for (Integer x : arr.subList(1, arr.size())) {
             if (x < pivot) {
                 lesser.add(x);
-            } else if (x > pivot) {
+            } else if (x >= pivot) {
                 greater.add(x);
             }
         }
```
* REVERSE_LINKED_LIST
```Java
@@ -17,6 +19,7 @@
         while (node != null) {
             nextnode = node.getSuccessor();
             node.setSuccessor(prevnode);
+            prevnode = node;
             node = nextnode;
         }
         return prevnode;
```
* RPN_EVAL
```Java
@@ -31,7 +31,7 @@
                 Double b = (Double) stack.pop();
 		Double c = 0.0;
 		BinaryOperator<Double> bin_op = op.get(token);
-		c = bin_op.apply(a,b);
+		c = bin_op.apply(b,a);
                 stack.push(c);
             }
         }
```
* SHORTEST_PATH_LENGTH
```Java
@@ -35,14 +37,14 @@
                 }
 
                 unvisitedNodes.put(nextnode, Math.min(unvisitedNodes.get(nextnode),
-                        unvisitedNodes.get(nextnode) + length_by_edge.get(Arrays.asList(node, nextnode))));
+                        distance + length_by_edge.get(Arrays.asList(node, nextnode))));
             }
         }
 
         return Integer.MAX_VALUE;
     }
```
* SHORTEST_PATH_LENGTHS
```Java
@@ -33,7 +33,7 @@
             for (int i = 0; i < numNodes; i++) {
                 for (int j = 0; j < numNodes; j++) {
                     int update_length = Math.min(length_by_path.get(Arrays.asList(i,j)),
-                            length_by_path.get(Arrays.asList(i,k)) + length_by_path.get(Arrays.asList(j,k)));
+                            length_by_path.get(Arrays.asList(i,k)) + length_by_path.get(Arrays.asList(k,j)));
                     length_by_path.put(Arrays.asList(i,j), update_length);
                 }
             }
```
* SHORTEST_PATHS
```Java
@@ -27,37 +31,11 @@
                         weight_by_node.get(edge.get(0))
                                 + weight_by_edge.get(edge),
                         weight_by_node.get(edge.get(1)));
-                weight_by_edge.put(edge, update_weight);            
+                weight_by_node.put(edge.get(1), update_weight);
             }
         }
         return weight_by_node;
     }
```
* SIEVE
```Java
@@ -38,7 +38,7 @@
     public static ArrayList<Integer> sieve(Integer max) {
         ArrayList<Integer> primes = new ArrayList<Integer>();
         for (int n=2; n<max+1; n++) {
-            if (any(list_comp(n, primes))) {
+            if (all(list_comp(n, primes))) {
                 primes.add(n);
             }
         }

```

* SQRT
```Java
@@ -13,7 +13,7 @@
 public class SQRT {
     public static double sqrt(double x, double epsilon) {
         double approx = x / 2d;
-        while (Math.abs(x-approx) > epsilon) {
+        while (Math.abs(x-approx*approx) > epsilon) {
             approx = 0.5d * (approx + x / approx);
         }
         return approx;
```

* SUBSEQUENCES
```Java
@@ -13,7 +13,9 @@
 public class SUBSEQUENCES {
     public static ArrayList<ArrayList> subsequences(int a, int b, int k) {
         if (k == 0) {
-            return new ArrayList();
+        	 ArrayList empty_set = new ArrayList<ArrayList>();
+         empty_set.add(new ArrayList());
+         return empty_set;
         }
 
         ArrayList ret = new ArrayList(50);

```

* TO_BASE
```Java
@@ -18,7 +18,7 @@
         while (num > 0) {
             i = num % b;
             num = num / b; // floor division?
-            result = result + String.valueOf(alphabet.charAt(i));
+            result = String.valueOf(alphabet.charAt(i))+result;
         }
 
         return result;
```

* TOPOLOGICAL_ORDERING
```Java
@@ -14,7 +16,7 @@
         for (int i = 0; i < listSize; i++) {
             Node node = orderedNodes.get(i);
             for (Node nextNode : node.getSuccessors()) {
-                if (orderedNodes.containsAll(nextNode.getSuccessors()) && !orderedNodes.contains(nextNode)) {
+                if (orderedNodes.containsAll(nextNode.getPredecessors()) && !orderedNodes.contains(nextNode)) {
                     orderedNodes.add(nextNode);
                     listSize++;
                 }
```

* WRAP
```Java
@@ -28,7 +28,7 @@
             text = text.substring(end);
             lines.add(line);
         }
-
+        lines.add(text);
         return lines;
     }
 }
```

### Preconditions

Some programs of QuixBugs have preconditions that constraints the input domain. It is important to clear about the preconditions when sampling the input domain for genereating tests in InputSampling.

| program | preconditions|
| --- |---|
|bitcount|A nonnegative int|
|breadth_first_search|-|
|bucketsort|0 <= x < k for x in arr|
|depth_first_search|-|
|detect_cycle|-|
|find_first_in_sorted| -|
|find_in_sorted|A sorted list of ints|
|flatten| The input has no list containment cycles|
|gcd|A and b are nonnegative int|
|get_factors|n >= 1|
|hanoi|The height >= 0 start peg and end peg in (1, 2, 3)|
|is_valid_parenthesization|paren in '()'|
|kheapsort|The elements of arr are unique and each element is at most k places from its sorted position|
|knapsack|-|
|kth|The arr is a list of ints and k is an int, 0 <= k < len(arr)|
|levenshtein|-|
|lis|The ints in arr are unique|
|longest_common_subsequence| -|
|max_sublist_sum| -| 
|mergesort|-|
|minimum_spanning_tree|The input graph is connected|
|next_palindrome|The initial input array represents a palindrome|
|next_permutation|The perm is not sorted in reverse order|
|pascal|The n is the number of rows to return and n>=1|
|possible_change|-|
|powerset| The array is a list of ints|
|quicksort|the ints in arr are unique|
|reverse_linked_list|The input is acyclic|
|rpn_eval|token in ('+', '-', '*', '/')|
|shortest_path_length|The length > 0 for length in length by edge|
|shortest_path_lengths|There are no negative-length cycles in the input graph|
|shortest_paths|The input graph contains no negative-weight cycles|
|shunting_yard| isinstance(token, int) or token in '+-*/' |
|sieve| - |
|sqrt|The x >= 1 and epsilon > 0|
|subsequences|The a and b are ints and k is a positive int|
|to_base|The num > 0, 2 <= b <= 36|
|topological_ordering|The input graph is acyclic|
| wrap|The target column width>0|



### Tests to prove manual analysis of patch correctness
While manual analysis of patch correctness, if a patch is considered as incorrect, the author must show a test that the same input would have two different ouputs between patch program and reference program.

|Patch| Input | Output from reference program | Output from patched program|
| --- |---| --- |---|
|depth_first_search(Astor)-p0| new Node( "MkLlUfgc",new ArrayList<Node>(Arrays.asList( new Node("a")))) , new Node( "UCmpcBi",new ArrayList<Node>(Arrays.asList(new Node("HtpbRgv"))) | false | true|
  |depth_first_search(Astor)-p1| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
 |depth_first_search(Astor)-p2| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
   |depth_first_search(Nopol)| new Node("j,ava_programs.Node") , Node node1 = new Node("j,ava_programs.Node", new Node("j,ava_programs.Node"))| false | Stack overflow|
  |find_in_sorted(Nopol)| [21,33,45,67,69,70], 100|-1|3|
  |get_factors(Nopol)| 0 | 0 | Arithmetical exception|
|next_permutation(Astor)|[1,3,2,2,1,3,1] |[1,3,2,2,3,1,1]|[1,3,2,2,1,1,3]|
|is_valid_parenthesization(Astor)|"(((())(())"|false|true|
|powerset(Astor)-p0|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[],[l],[a,l]]| 
|powerset(Astor)-p1|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[]]|  
|powerset(Astor)-p2|new ArrayList(Arrays.asList( "a","l"))|[[],[l],[a],[a,l]]|[[],[l],[a,l]]|  
|shortest_path_lengths(Astor)|HashMap <List<Integer>,Integer> map = new HashMap<List<Integer>,Integer>(); map.put(new ArrayList<Integer>(Arrays.asList(2,6)), 8);|{[0, 0]=0, [0, 1]=99999, [0, 2]=99999...}|{[0, 0]=0, [0, 1]=99999}|    
  
  
### Failing Evosuite Tests

Evosuite generates test cases that fail on the version used for generating them, more information [here](https://github.com/KTH/quixbugs-experiment/issues/1). These failing tests will result in incorrect patch assessment result. To address this problem, we first run all Evosuite test over corresponding the referecen program (using [this](https://github.com/KTH/quixbugs-experiment/blob/master/src/test/java/qfevotest/generator/PatchAssessmentTest.java#L228) method to check), then manually remove the failing tests. 

| program | reason|
| --- |---|
|find_in_sorted|Undeclared exception |
|get_factors|Undeclared exception|
|knapsack |Undeclared exception|
|levenshtein| Undeclared exception|
|next_permutation|Undeclared exception|
|shortest_path_lengths|Undeclared exception|
  




