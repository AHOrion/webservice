package principal;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import com.dataaccess.www.webservicesserver.NumberConversionSoapType;
import com.dataaccess.www.webservicesserver.NumberConversionSoapTypeProxy;

public class TestRemoto {

	public static void main(String[] args) throws RemoteException {
		
		NumberConversionSoapType px;
		NumberConversionSoapTypeProxy proxy = new NumberConversionSoapTypeProxy();
		px=proxy.getNumberConversionSoapType();
		
//		System.out.println(px.numberToWords(1000));//Tipo raro
		System.out.println(px.numberToDollars(new BigDecimal(40)));

	}

}
