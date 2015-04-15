import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.Assertions.assertThat;


@RunWith(Parameterized.class)
public class ApplicationTest {

    @Parameterized.Parameter(0)
    public String foo;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "foo" }, { "bar" }
        });
    }

    @Test
    public void isNotBar() {
        assertThat(foo).isNotEqualTo("bar");
    }


}
