# DSAJava 📊

Welcome to DSAJava, the Data Structures and Algorithms learning package within the LearnJava repository!

## 🎯 What is DSA?

**DSA** is an abbreviation for **Data Structure and Algorithm**.

- **Data Structure** means the way we store and organize data.
- **Algorithm** is the step-by-step process of solving a problem to get the expected outcomes.

### Why Learn DSA?

Understanding Data Structures and Algorithms is crucial for:
- Writing efficient and optimized code
- Solving complex programming problems
- Excelling in technical interviews
- Building scalable applications
- Improving computational thinking

## 📚 Package Contents

### **leetcode**
This package contains solutions to LeetCode problems with guided explanations, helping you:
- Master algorithm design patterns
- Practice problem-solving on real coding challenges
- Understand different approaches and optimizations
- Learn from well-documented, commented code

## 🔍 Data Structures Overview

Data Structures are divided into three main categories:

### **Linear Data Structures**
Store data in sequential order where each element connects to its previous and next element.

- **Arrays**: Fixed size contiguous memory storing elements of the same type.
- **Linked Lists**: Elements (nodes) containing data and pointers to the next node.
- **Stacks**: Use the principle of LIFO (Last-in, First-out) where insertions and deletions occur at one end.
- **Queues**: Use FIFO (First-in, First-out) where items insert at the back and exit from the front.
- **Vectors/Dynamic Arrays**: Arrays that dynamically resize when elements are added.

### **Non-Linear Data Structures**
Elements are not arranged sequentially, but form hierarchical or multi-level relationships.

- **Trees**: Hierarchical structures with a root node and parent-child relationships (e.g., Binary Trees, AVL Trees, Heaps).
- **Graphs**: Networks consisting of vertices (nodes) connected by edges (links), which can be directed or undirected.
- **Tries**: Prefix trees used for efficient retrieval of keys, typically strings.
- **Multidimensional Arrays**: Matrix structures (like 2D arrays) representing data in grids rather than a single line.

### **Hashed Data Structures**
Elements are stored and retrieved using a hash function to transform a key into an index location for ultra-fast, constant-time access.

- **Hash Tables**: Key-value pairs mapped to array indices via a hashing algorithm.
- **Hash Maps**: Object-oriented implementations of hash tables mapping unique keys to values.
- **Hash Sets**: Collections of unique elements backed internally by a hashing mechanism.
- **Bloom Filters**: Space-efficient, probabilistic data structures used to test set membership.

## ⏱️ Algorithm Analysis

### Evaluating Algorithms

To assess how good your algorithms are and design better solutions, you need to understand:

1. **Accuracy**: Can you achieve the expected outcomes from the algorithm you have written?
2. **Time Complexity**: The time it takes to complete the task.
3. **Space Complexity**: How much extra space you are utilizing to solve the problem.

We use **Big O notation** to denote Time and Space Complexity.

### Big O Notation Examples

#### **Time Complexity**

- **BigO(1) - Constant Time**: Execution time remains constant regardless of input size.
- **BigO(log n) - Logarithmic Time**: Execution time grows slowly because the input size is cut in half at each step.
- **BigO(n) - Linear Time**: Execution time grows directly and proportionally with input data size.
- **BigO(n²) - Quadratic Time**: Execution time grows quadratically due to nested loops iterating over the same input.
- **BigO(2^n) - Exponential Time**: Execution time doubles with each additional input element, typically seen in naive recursive algorithms.

#### **Space Complexity**

- **BigO(1) - Constant Space**: Memory usage remains fixed and does not change with input size.
- **BigO(log n) - Logarithmic Space**: Memory usage grows minimally, usually tracking recursion stack depth or tree height.
- **BigO(n) - Linear Space**: Extra memory allocated grows proportionally to input size, like creating a duplicate array.
- **BigO(n²) - Quadratic Space**: Extra memory grows quadratically, like initializing a two-dimensional grid of size (n × n).
- **BigO(2^n) - Exponential Space**: Extra memory doubles with each new input, often matching the deep call stack of exponential recursion.

## 💡 Example: Searching Names with a Key

Here's a practical example demonstrating Data Structure and Algorithm concepts:

```java
// You have two data structures: an array of names and a search key
// Now we want to print only those names which start with the searched key
String[] names = {"Ibrar", "Khan", "Ayaz", "Shabbir", "Irfan", "Afsar", "Sahel", "Baba"};
String searchedKey = "S";

// Algorithm: Step-by-step instructions to get only names starting with the searched key
for (int i = 0; i < names.length; i++) {
    if (names[i].startsWith(searchedKey)) {
        System.out.println(names[i]);
    }
}

// Time Complexity: BigO(N × M)
// N = number of elements in the names array
// M = length of the searchedKey
// The for loop runs N times, and each startsWith() comparison runs up to M times
// Total operations = N × M

// Space Complexity: BigO(1)
// Constant space because we are not creating new data structures
// or dynamically growing any structures
```

### Analysis of the Example

- **Time Complexity: BigO(N × M)** - The loop iterates through N elements, and each string comparison takes up to M operations.
- **Space Complexity: BigO(1)** - We only use a fixed amount of extra memory regardless of input size.

## 🚀 Getting Started

1. Navigate to the `leetcode` directory to find problem solutions.
2. Each solution includes:
   - Problem description
   - Approach explanation
   - Well-commented code
   - Time and Space Complexity analysis
   - Alternative solutions when available

3. Study the problems progressively, starting with easier patterns and moving to more complex algorithms.

## 🤝 Contributing

We encourage contributions! You can help by:
- Adding solutions to new LeetCode problems
- Improving existing solutions with better approaches
- Providing alternative implementations
- Writing clearer explanations
- Fixing bugs or optimizing code
- Adding test cases

Please follow the contribution guidelines from the main repository's README.

## 📖 Learning Tips

1. **Understand Before Memorizing**: Focus on understanding the algorithm's logic before memorizing code.
2. **Analyze Complexity**: Always analyze time and space complexity of your solutions.
3. **Practice Different Patterns**: Work on various problem types to recognize patterns.
4. **Optimize Incrementally**: Start with a working solution, then optimize it.
5. **Explain Out Loud**: Explaining code and logic helps reinforce learning.

## 📚 Recommended Resources

- **LeetCode**: [leetcode.com](https://leetcode.com/) - Practice platform with thousands of problems
- **GeeksforGeeks**: Algorithm explanations and tutorials
- **Algorithms by Robert Sedgewick**: Comprehensive algorithms textbook
- **Introduction to Algorithms (CLRS)**: The classic algorithms book

---

**Happy Learning! 🎓**

Master Data Structures and Algorithms to become a better programmer and problem solver!

*Last Updated: 2026-07-16*
