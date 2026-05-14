# CSV Converter

A simple Java command-line application that reads CSV files and allows filtering and sorting data by column.

## Technologies
- Java 21
- Maven

## Project Structure
- `CsvReader` — reads the CSV file and returns structured data
- `CsvData` — stores the header and data rows separately
- `DataProcessor` — filters and sorts data by column
- `ReportWriter` — displays the result in the console

## How to Run

### From the terminal
Make sure you have Java 21 installed.

```bash
java -jar target/csvWriter-1.0-SNAPSHOT.jar
```

### Building from source
```bash
mvn clean package
java -jar target/csvWriter-1.0-SNAPSHOT.jar
```

## Features
- Read any CSV file with headers
- Filter rows by column and value (case-insensitive)
- Sort rows by column (text or numeric)

## Example

Input (`data/input.csv`):
- nome,idade,altura,peso
- Jonas,26,1.75,80
- Maria,31,1.62,58

Output (filtered by "Maria"):
- Maria 31 1.62 58