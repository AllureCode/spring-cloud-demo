import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-22 20:02
 **/
@SpringBootTest
public class test {
    @Autowired
    private DataSource dataSource;
    @Test
    public void test() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
