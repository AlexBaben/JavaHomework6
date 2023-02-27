import com.opencsv.CSVReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;


import java.io.FileReader;
import java.io.IOException;

public class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/SumTestData.csv", numLinesToSkip=1)
    public void sumSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\SumTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.sumSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/AverageSumTestData.csv", numLinesToSkip = 1)
    public void averageSumSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\AverageSumTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.averageSumSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MaxSalesTestData.csv", numLinesToSkip = 1)
    public void maxSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\MaxSalesTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.maxSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MinSalesTestData.csv", numLinesToSkip = 1)
    public void minSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\MinSalesTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.minSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/LowerAveSalesTestData.csv", numLinesToSkip = 1)
    public void lowerAveSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\LowerAveSalesTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.lowerAveSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/AboveAveSalesTestData.csv", numLinesToSkip = 1)
    public void aboveAveSalesTest(int expected) {
        String[] args;
        try (CSVReader csvReader = new CSVReader(new FileReader("D:\\JavaHomework\\JavaHomework6\\src\\test\\resources\\AboveAveSalesTestData.csv"))) {
            while ((args = csvReader.readNext()) != null) {
                int[] sales = new int[args.length];
                for (int i = 0; i < sales.length; i++) {
                    sales[i] = Integer.parseInt(args[i]);
                }
                StatsService service = new StatsService();
                int actual = service.aboveAveSales(sales);
                Assertions.assertEquals(expected, actual);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



