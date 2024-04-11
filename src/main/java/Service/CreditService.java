package Service;

import dao.CreditDaoImpl;
import model.Credit;

public class CreditService {
    private static CreditDaoImpl dao = new CreditDaoImpl();

    public static Credit getById(int id){
        return dao.getById(id);
    }
}
