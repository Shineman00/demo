import org.junit.Test;

import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void test01() {

        System.out.println("sdwada");
    }

    private static List<Map<String, Object>> sortMapListByFeild(List<Map<String, Object>> list, String feild, String sortTyp) {
        if (list.size() != 0 && list != null) {
            list.sort((m1, m2) -> {
                if (sortTyp.equals("desc")) {
                    return String.valueOf(m2.get(feild)).compareTo(String.valueOf(m1.get(feild)));
                } else {
                    return String.valueOf(m1.get(feild)).compareTo(String.valueOf(m2.get(feild)));
                }
            });
        }
        return list;
    }

}
