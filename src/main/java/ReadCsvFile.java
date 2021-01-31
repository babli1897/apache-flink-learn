import com.paytm.dto.SwitchRecord;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.CsvReader;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple4;


public class ReadCsvFile {

    public static void main(String[] args) throws Exception{
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        CsvReader tuple4DataSet= env.readCsvFile("/home/bablikumari/Downloads/nationalparks.csv").fieldDelimiter(",");


        DataSource<Tuple4<String,String,String,String>> ds = tuple4DataSet.ignoreFirstLine().types(String.class,String.class,String.class,String.class);
        for(Tuple4<String,String,String,String> td : ds.collect())
        {
            System.out.println(td.f0+"____"+td.f1);
        }
    }
}
