

---

#  Flood Risk Alert System

##  Project Overview

The **Flood Risk Alert System** is a Java-based console application designed to simulate a real-world disaster monitoring system. It collects rainfall data for multiple areas over a 7-day period, processes the data, and determines flood risk levels based on calculated averages.

This project demonstrates core programming concepts such as arrays, loops, decision structures, and modular programming.

---

##  Problem Statement

Heavy rainfall during monsoon seasons can lead to flooding in urban and rural areas. Manual monitoring of rainfall data is slow and error-prone. This system automates the process of collecting rainfall data, analyzing it, and generating flood risk alerts for better decision-making.

---

## ⚙️ Features

* Input rainfall data for 5 different areas over 7 days
* Calculate average rainfall per area
* Classify flood risk levels:

  * LOW
  * MEDIUM
  * HIGH
  * CRITICAL
* Display a formatted summary report
* Identify the most at-risk area
* Generate emergency alerts for critical conditions

---

##  Concepts Used

* Arrays (1D and 2D)
* Loops (for loop, while loop)
* Decision Making (if-else, switch)
* Modular Programming (methods/functions)
* Data processing and analysis

---

##  System Design

The program is divided into the following modules:

1. **Input Module** – Collects area names and rainfall data
2. **Processing Module** – Calculates average rainfall
3. **Risk Analysis Module** – Assigns risk levels
4. **Reporting Module** – Displays formatted results
5. **Analysis Module** – Finds highest risk area
6. **Alert Module** – Generates emergency warnings

---

##  Test Cases

| Area       | Input (mm)                 | Avg   | Risk     | Result |
| ---------- | -------------------------- | ----- | -------- | ------ |
| Sydney     | 5, 8, 3, 6, 4, 7, 5        | 5.43  | LOW      | PASS   |
| Melbourne  | 22, 25, 30, 18, 28, 24, 20 | 23.86 | MEDIUM   | PASS   |
| Brisbane   | 40, 45, 50, 42, 44, 48, 41 | 44.29 | HIGH     | PASS   |
| Darwin     | 65, 70, 80, 75, 68, 72, 66 | 70.86 | CRITICAL | PASS   |
| Perth      | 15, 10, 12, 18, 11, 14, 10 | 12.86 | LOW      | PASS   |
| Outback    | 0, 0, 0, 0, 0, 0, 0        | 0.00  | LOW      | PASS   |
| Queensland | 60, 60, 60, 60, 60, 60, 60 | 60.00 | CRITICAL | PASS   |

---

##  Pseudocode Summary

The system:

1. Takes input for multiple areas
2. Stores rainfall data in a 2D array
3. Calculates average rainfall
4. Uses conditions to assign risk levels
5. Displays results in a formatted report
6. Identifies highest-risk area
7. Generates emergency alerts

---

## Output Example

```
FLOOD RISK SUMMARY REPORT

Sydney     - 5.43 mm  - LOW
Melbourne  - 23.86 mm - MEDIUM
Brisbane   - 44.29 mm - HIGH
Darwin     - 70.86 mm - CRITICAL
```

---

##  Real-World Application

This system simulates real flood monitoring approaches used in disaster management systems for early warning and risk assessment.

---

## Author

Student Project – Object Oriented Design and Programming (OODP101)

---

##  Note

This is a simplified simulation model designed for educational purposes to demonstrate programming logic, not a real-time weather prediction system.

---

