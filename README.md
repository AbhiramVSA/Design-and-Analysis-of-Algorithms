<p align="center">
  <img src="assets/algorithm-reference-logo.png" alt="Open book with an algorithm tree" width="240">
</p>

<h1 align="center">CSE3004: Design and Analysis of Algorithms</h1>

<p align="center">
  <a href="#java-examples">Java examples</a> |
  <a href="#example-output-merge-sort">Example output</a> |
  <a href="#run-the-examples">Run examples</a>
</p>

<p align="center">
  <a href="#course-overview">Course overview</a> |
  <a href="#textbooks-and-references">References</a> |
  <a href="#license">License</a>
</p>

This repository contains a course reference for CSE3004 and three Java examples. The course details below come from the original README. They describe the course curriculum, not the code in this repository.

- **Maintainer:** Abhiram Adabala
- **Course type:** Embedded Theory and Lab (ETL)
- **Academic version:** 1.2 (2024)

## Java examples

The repository contains three Java source files. Each file declares a class named `Main`.

| Example | Source file | Behavior |
|---|---|---|
| Binary search | [binarySearch.java](sorting-algorithms/divide-and-conquer/binary-search/binarySearch.java) | The `main` method uses `Arrays.binarySearch` to search the sorted values 0 through 99 for 42. |
| Merge sort | [mergeSort.java](sorting-algorithms/divide-and-conquer/merge-sort/mergeSort.java) | The `main` method sorts a fixed array of nine integers. |
| Quick sort | [quickSort.java](sorting-algorithms/divide-and-conquer/quick-sort/quickSort.java) | The `main` method sorts a fixed array of nine integers. |

The binary-search file also contains a private search method. The `main` method does not call that method.

## Example output: merge sort

Run this command from the repository root:

```sh
mkdir -p /tmp/cse3004-merge-sort
javac -d /tmp/cse3004-merge-sort sorting-algorithms/divide-and-conquer/merge-sort/mergeSort.java
java -cp /tmp/cse3004-merge-sort Main
```

The program prints this result for its fixed input:

```text
1 2 3 4 5 6 7 8 9
```

The captured output ends with a space and has no final newline.

## Run the examples

Install a Java Development Kit (JDK) that provides `javac` and `java`. The repository has no Maven or Gradle build file. Compile each example separately because each source file declares a class named `Main`.

Run these commands from the repository root:

```sh
mkdir -p /tmp/cse3004-binary-search
javac -d /tmp/cse3004-binary-search sorting-algorithms/divide-and-conquer/binary-search/binarySearch.java
java -cp /tmp/cse3004-binary-search Main

mkdir -p /tmp/cse3004-merge-sort
javac -d /tmp/cse3004-merge-sort sorting-algorithms/divide-and-conquer/merge-sort/mergeSort.java
java -cp /tmp/cse3004-merge-sort Main

mkdir -p /tmp/cse3004-quick-sort
javac -d /tmp/cse3004-quick-sort sorting-algorithms/divide-and-conquer/quick-sort/quickSort.java
java -cp /tmp/cse3004-quick-sort Main
```

## Course overview

- **Credits:** 3-2-4
- **Prerequisite:** CSE2001
- **Antirequisite:** None

### Course objectives

- Understand classic algorithms across different domains.
- Analyze time and space complexity with asymptotic notation.
- Design algorithms with Brute Force, Divide and Conquer, Greedy, Dynamic Programming, Backtracking, and Branch and Bound.
- Prove algorithm correctness with inductive methods.
- Solve computational problems with efficient methods.

### Course outcomes

| Outcome | Description |
|---|---|
| CO1 | Prove algorithm correctness and analyze running time with asymptotic analysis. |
| CO2 | Identify problems that suit Brute Force or Divide and Conquer. |
| CO3 | Apply Greedy and Dynamic Programming to optimization problems. |
| CO4 | Understand and apply iterative improvement methods to real-world problems. |
| CO5 | Solve decision problems with Backtracking and state-space trees. |
| CO6 | Apply Branch and Bound and understand NP-Completeness. |

### Lab topics in the course reference

The course reference lists these lab topics. The repository does not contain source code for all of them.

| # | Topic | Method |
|---:|---|---|
| 1 | Prim's Algorithm | Greedy |
| 2 | Kruskal's Algorithm | Greedy |
| 3 | Matrix Chain Multiplication | Dynamic Programming |
| 4 | 8-Queens Problem | Backtracking |
| 5 | Strongly Connected Components in Digraph | Graph Algorithm |
| 6 | File Compression and Decompression with Huffman Coding | Greedy |
| 7 | All Pairs Shortest Path | Dynamic Programming |
| 8 | 0/1 Knapsack (Greedy and Dynamic Programming) | Greedy, DP |
| 9 | 0/1 Knapsack (Backtracking and Branch and Bound) | Backtracking, B&B |
| 10 | Optimal Binary Search Tree | Dynamic Programming |
| 11 | Traveling Salesman Problem (TSP) - DP | Dynamic Programming |
| 12 | TSP - Backtracking | Backtracking |
| 13 | TSP - Branch and Bound | Branch and Bound |
| 14 | Graph Coloring Problem | Backtracking |
| 15 | Hamiltonian Circuit | Backtracking |

### Theory modules

| Module | Title | Hours | Topics |
|---:|---|---:|---|
| 1 | Introduction | 8 | Algorithms, problem solving, analysis methods, asymptotic notation |
| 2 | Divide and Conquer | 6 | Merge Sort, Quick Sort, Binary Search |
| 3 | Greedy and Dynamic Programming | 12 | MST, Knapsack, LCS, Matrix Chain Multiplication, String Matching, Floyd-Warshall Algorithms |
| 4 | Iterative Improvement | 5 | Simplex, Max Flow, Stable Marriage Problem |
| 5 | Backtracking | 6 | N-Queens, Subset Sum, Graph Coloring, Hamiltonian Circuit |
| 6 | Branch and Bound and NP-Completeness | 8 | TSP, Job Scheduling, NP Problems, Polynomial Reductions |

## Textbooks and references

### Primary textbook

- Anany Levitin, *Introduction to the Design and Analysis of Algorithms*, Pearson, 3rd edition, 2017.

### References

- Cormen et al., *Introduction to Algorithms*, MIT Press, 3rd edition, 2012.
- Horowitz and Sahni, *Fundamentals of Computer Algorithms*, 2nd edition, 2008.
- Aho, Hopcroft, and Ullman, *Data Structures and Algorithms*, Pearson.
- Donald Knuth, *The Art of Computer Programming*, Volumes 1 and 3.
- Steven Skiena, *The Algorithm Design Manual*, Springer, 2nd edition, 2008.

## Mode of evaluation

| Component | Weight |
|---|---:|
| Theory | 75% |
| Theory: CAT 1 | 15% |
| Theory: CAT 2 | 15% |
| Theory: digital assignments and quizzes | 30% |
| Theory: final assessment | 40% |
| Laboratory | 25% |

## Academic approval

- **Modified by:** Dr. Saroj Kumar Panigrahy
- **Recommended by:** 14th BoS, 11.05.2024
- **Approved by:** 12th AC, 25.05.2024

## Contribute

1. Fork this repository.
2. Create a feature branch: `git checkout -b feature/YourFeature`.
3. Commit your changes: `git commit -m 'Add your message'`.
4. Push the branch: `git push origin feature/YourFeature`.
5. Create a pull request.

## Contact

For questions or contributions, contact [abhiramvsa7@gmail.com].

## License

The repository includes the MIT License in [LICENSE](LICENSE).
