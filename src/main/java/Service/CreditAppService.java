package Service;

import dao.CreditAppImpl;
import model.Credit;
import model.CreditApp;

public class CreditAppService {
    private static CreditAppImpl dao = new CreditAppImpl();
    public static CreditApp getById(int id){
        return dao.getById(id);
    }

}
