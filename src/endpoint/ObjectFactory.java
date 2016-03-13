
package endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReturnBookResponse_QNAME = new QName("http://endpoint/", "returnBookResponse");
    private final static QName _TakeBookFromLibrary_QNAME = new QName("http://endpoint/", "takeBookFromLibrary");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://endpoint/", "getAllBooksResponse");
    private final static QName _RegistrationResponse_QNAME = new QName("http://endpoint/", "registrationResponse");
    private final static QName _Registration_QNAME = new QName("http://endpoint/", "registration");
    private final static QName _UserAuthorizationResponse_QNAME = new QName("http://endpoint/", "userAuthorizationResponse");
    private final static QName _ExtendUsageResponse_QNAME = new QName("http://endpoint/", "extendUsageResponse");
    private final static QName _ExtendUsage_QNAME = new QName("http://endpoint/", "extendUsage");
    private final static QName _GetAllBooks_QNAME = new QName("http://endpoint/", "getAllBooks");
    private final static QName _TakeBookFromLibraryResponse_QNAME = new QName("http://endpoint/", "takeBookFromLibraryResponse");
    private final static QName _ReturnBook_QNAME = new QName("http://endpoint/", "returnBook");
    private final static QName _MakeOrder_QNAME = new QName("http://endpoint/", "make_order");
    private final static QName _MakeOrderResponse_QNAME = new QName("http://endpoint/", "make_orderResponse");
    private final static QName _UserAuthorization_QNAME = new QName("http://endpoint/", "userAuthorization");
    private final static QName _GetAvailableBooks_QNAME = new QName("http://endpoint/", "getAvailableBooks");
    private final static QName _GetUserBooks_QNAME = new QName("http://endpoint/", "getUserBooks");
    private final static QName _GetAvailableBooksResponse_QNAME = new QName("http://endpoint/", "getAvailableBooksResponse");
    private final static QName _GetUserBooksResponse_QNAME = new QName("http://endpoint/", "getUserBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableBooksResponse }
     * 
     */
    public GetAvailableBooksResponse createGetAvailableBooksResponse() {
        return new GetAvailableBooksResponse();
    }

    /**
     * Create an instance of {@link GetUserBooksResponse }
     * 
     */
    public GetUserBooksResponse createGetUserBooksResponse() {
        return new GetUserBooksResponse();
    }

    /**
     * Create an instance of {@link GetUserBooks }
     * 
     */
    public GetUserBooks createGetUserBooks() {
        return new GetUserBooks();
    }

    /**
     * Create an instance of {@link GetAvailableBooks }
     * 
     */
    public GetAvailableBooks createGetAvailableBooks() {
        return new GetAvailableBooks();
    }

    /**
     * Create an instance of {@link MakeOrderResponse }
     * 
     */
    public MakeOrderResponse createMakeOrderResponse() {
        return new MakeOrderResponse();
    }

    /**
     * Create an instance of {@link UserAuthorization }
     * 
     */
    public UserAuthorization createUserAuthorization() {
        return new UserAuthorization();
    }

    /**
     * Create an instance of {@link MakeOrder }
     * 
     */
    public MakeOrder createMakeOrder() {
        return new MakeOrder();
    }

    /**
     * Create an instance of {@link ExtendUsage }
     * 
     */
    public ExtendUsage createExtendUsage() {
        return new ExtendUsage();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link TakeBookFromLibraryResponse }
     * 
     */
    public TakeBookFromLibraryResponse createTakeBookFromLibraryResponse() {
        return new TakeBookFromLibraryResponse();
    }

    /**
     * Create an instance of {@link ReturnBook }
     * 
     */
    public ReturnBook createReturnBook() {
        return new ReturnBook();
    }

    /**
     * Create an instance of {@link UserAuthorizationResponse }
     * 
     */
    public UserAuthorizationResponse createUserAuthorizationResponse() {
        return new UserAuthorizationResponse();
    }

    /**
     * Create an instance of {@link ExtendUsageResponse }
     * 
     */
    public ExtendUsageResponse createExtendUsageResponse() {
        return new ExtendUsageResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link ReturnBookResponse }
     * 
     */
    public ReturnBookResponse createReturnBookResponse() {
        return new ReturnBookResponse();
    }

    /**
     * Create an instance of {@link TakeBookFromLibrary }
     * 
     */
    public TakeBookFromLibrary createTakeBookFromLibrary() {
        return new TakeBookFromLibrary();
    }

    /**
     * Create an instance of {@link DatabaseObject }
     * 
     */
    public DatabaseObject createDatabaseObject() {
        return new DatabaseObject();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link AuthWrap }
     * 
     */
    public AuthWrap createAuthWrap() {
        return new AuthWrap();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "returnBookResponse")
    public JAXBElement<ReturnBookResponse> createReturnBookResponse(ReturnBookResponse value) {
        return new JAXBElement<ReturnBookResponse>(_ReturnBookResponse_QNAME, ReturnBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeBookFromLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "takeBookFromLibrary")
    public JAXBElement<TakeBookFromLibrary> createTakeBookFromLibrary(TakeBookFromLibrary value) {
        return new JAXBElement<TakeBookFromLibrary>(_TakeBookFromLibrary_QNAME, TakeBookFromLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthorizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "userAuthorizationResponse")
    public JAXBElement<UserAuthorizationResponse> createUserAuthorizationResponse(UserAuthorizationResponse value) {
        return new JAXBElement<UserAuthorizationResponse>(_UserAuthorizationResponse_QNAME, UserAuthorizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendUsageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "extendUsageResponse")
    public JAXBElement<ExtendUsageResponse> createExtendUsageResponse(ExtendUsageResponse value) {
        return new JAXBElement<ExtendUsageResponse>(_ExtendUsageResponse_QNAME, ExtendUsageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "extendUsage")
    public JAXBElement<ExtendUsage> createExtendUsage(ExtendUsage value) {
        return new JAXBElement<ExtendUsage>(_ExtendUsage_QNAME, ExtendUsage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeBookFromLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "takeBookFromLibraryResponse")
    public JAXBElement<TakeBookFromLibraryResponse> createTakeBookFromLibraryResponse(TakeBookFromLibraryResponse value) {
        return new JAXBElement<TakeBookFromLibraryResponse>(_TakeBookFromLibraryResponse_QNAME, TakeBookFromLibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "returnBook")
    public JAXBElement<ReturnBook> createReturnBook(ReturnBook value) {
        return new JAXBElement<ReturnBook>(_ReturnBook_QNAME, ReturnBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "make_order")
    public JAXBElement<MakeOrder> createMakeOrder(MakeOrder value) {
        return new JAXBElement<MakeOrder>(_MakeOrder_QNAME, MakeOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "make_orderResponse")
    public JAXBElement<MakeOrderResponse> createMakeOrderResponse(MakeOrderResponse value) {
        return new JAXBElement<MakeOrderResponse>(_MakeOrderResponse_QNAME, MakeOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "userAuthorization")
    public JAXBElement<UserAuthorization> createUserAuthorization(UserAuthorization value) {
        return new JAXBElement<UserAuthorization>(_UserAuthorization_QNAME, UserAuthorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAvailableBooks")
    public JAXBElement<GetAvailableBooks> createGetAvailableBooks(GetAvailableBooks value) {
        return new JAXBElement<GetAvailableBooks>(_GetAvailableBooks_QNAME, GetAvailableBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUserBooks")
    public JAXBElement<GetUserBooks> createGetUserBooks(GetUserBooks value) {
        return new JAXBElement<GetUserBooks>(_GetUserBooks_QNAME, GetUserBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getAvailableBooksResponse")
    public JAXBElement<GetAvailableBooksResponse> createGetAvailableBooksResponse(GetAvailableBooksResponse value) {
        return new JAXBElement<GetAvailableBooksResponse>(_GetAvailableBooksResponse_QNAME, GetAvailableBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint/", name = "getUserBooksResponse")
    public JAXBElement<GetUserBooksResponse> createGetUserBooksResponse(GetUserBooksResponse value) {
        return new JAXBElement<GetUserBooksResponse>(_GetUserBooksResponse_QNAME, GetUserBooksResponse.class, null, value);
    }

}
