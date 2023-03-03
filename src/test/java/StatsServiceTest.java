import com.opencsv.CSVReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/SumTestData.csv", numLinesToSkip = 1)
    public void sumSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/SumTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/AverageSumTestData.csv", numLinesToSkip = 1)
    public void averageSumSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/AverageSumTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MaxSalesTestData.csv", numLinesToSkip = 1)
    public void maxSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/MaxSalesTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MinSalesTestData.csv", numLinesToSkip = 1)
    public void minSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/MinSalesTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/LowerAveSalesTestData.csv", numLinesToSkip = 1)
    public void lowerAveSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/LowerAveSalesTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/AboveAveSalesTestData.csv", numLinesToSkip = 1)
    public void aboveAveSalesTest(int expected) throws IOException, URISyntaxException {
        String[] args;
        File file = new File(Objects.requireNonNull(getClass().getResource("/AboveAveSalesTestData.csv")).toURI());
        CSVReader csvReader = new CSVReader(new FileReader(file));
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
    }
}




