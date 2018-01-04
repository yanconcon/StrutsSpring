package Java;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
public class IocAction extends ActionSupport {
    private IocTestInterface iti;
    private List list;

    public List getList() {
        return list;
    }
    public void setList(List list) {
        this.list = list;
    }
    public IocTestInterface getIti() {
        return iti;
    }
    public void setIti(IocTestInterface iti) {
        this.iti = iti;
    }

    public String execute() throws Exception {
        this.setList(iti.getList());
        return super.execute();
    }
}
