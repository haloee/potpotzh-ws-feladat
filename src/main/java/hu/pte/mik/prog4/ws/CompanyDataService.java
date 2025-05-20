package hu.pte.mik.prog4.ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(
        style = Style.DOCUMENT
)
public interface CompanyDataService {
    @WebMethod
    CompanyDataResponse getCompanyData(CompanyDataRequest request);
}
