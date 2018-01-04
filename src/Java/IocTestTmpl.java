package Java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
public class IocTestTmpl implements IocTestInterface {
        public List getList() {
            List l = new ArrayList();
            l.add("abc");
            l.add("def");
            l.add("hig");
            return l;
        }

}
