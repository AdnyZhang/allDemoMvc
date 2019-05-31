
package com.juntaihc.jdk;

import org.apache.camel.Header;
import sun.security.util.Password;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://www.juntaihc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Echo", action = "http://www.juntaihc.com/JTHC_Echo")
    @WebResult(name = "JTHC_EchoResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Echo", targetNamespace = "http://www.juntaihc.com/", className = "JTHCEcho")
    @ResponseWrapper(localName = "JTHC_EchoResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCEchoResponse")
    public String jthcEcho();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Hospitals", action = "http://www.juntaihc.com/JTHC_Hospitals")
    @WebResult(name = "JTHC_HospitalsResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Hospitals", targetNamespace = "http://www.juntaihc.com/", className = "JTHCHospitals")
    @ResponseWrapper(localName = "JTHC_HospitalsResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCHospitalsResponse")
    public String jthcHospitals();

    /**
     * 
     * @param authKEY
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Depts", action = "http://www.juntaihc.com/JTHC_Depts")
    @WebResult(name = "JTHC_DeptsResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Depts", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDepts")
    @ResponseWrapper(localName = "JTHC_DeptsResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDeptsResponse")
    public String jthcDepts(
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param authKEY
     * @param docCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Doctors", action = "http://www.juntaihc.com/JTHC_Doctors")
    @WebResult(name = "JTHC_DoctorsResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Doctors", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDoctors")
    @ResponseWrapper(localName = "JTHC_DoctorsResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDoctorsResponse")
    public String jthcDoctors(
            @WebParam(name = "docCode", targetNamespace = "http://www.juntaihc.com/")
                    String docCode,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param authKEY
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_HBs", action = "http://www.juntaihc.com/JTHC_HBs")
    @WebResult(name = "JTHC_HBsResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_HBs", targetNamespace = "http://www.juntaihc.com/", className = "JTHCHBs")
    @ResponseWrapper(localName = "JTHC_HBsResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCHBsResponse")
    public String jthcHBs(
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param authKEY
     * @param hbBz
     * @param docCode
     * @param deptCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Schedules", action = "http://www.juntaihc.com/JTHC_Schedules")
    @WebResult(name = "JTHC_SchedulesResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Schedules", targetNamespace = "http://www.juntaihc.com/", className = "JTHCSchedules")
    @ResponseWrapper(localName = "JTHC_SchedulesResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCSchedulesResponse")
    public String jthcSchedules(
            @WebParam(name = "deptCode", targetNamespace = "http://www.juntaihc.com/")
                    String deptCode,
            @WebParam(name = "docCode", targetNamespace = "http://www.juntaihc.com/")
                    String docCode,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY,
            @WebParam(name = "hbBz", targetNamespace = "http://www.juntaihc.com/")
                    String hbBz);

    /**
     * 
     * @param authKEY
     * @param scheduleIds
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Schedule_Remain_TimeSlots", action = "http://www.juntaihc.com/JTHC_Schedule_Remain_TimeSlots")
    @WebResult(name = "JTHC_Schedule_Remain_TimeSlotsResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Schedule_Remain_TimeSlots", targetNamespace = "http://www.juntaihc.com/", className = "JTHCScheduleRemainTimeSlots")
    @ResponseWrapper(localName = "JTHC_Schedule_Remain_TimeSlotsResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCScheduleRemainTimeSlotsResponse")
    public String jthcScheduleRemainTimeSlots(
            @WebParam(name = "scheduleIds", targetNamespace = "http://www.juntaihc.com/")
                    String scheduleIds,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param patPhone
     * @param authKEY
     * @param patIdCard
     * @param patSex
     * @param channel
     * @param patName
     * @param resvSjd
     * @param scheduleId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Do_Reserve", action = "http://www.juntaihc.com/JTHC_Do_Reserve")
    @WebResult(name = "JTHC_Do_ReserveResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Do_Reserve", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDoReserve")
    @ResponseWrapper(localName = "JTHC_Do_ReserveResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCDoReserveResponse")
    public String jthcDoReserve(
            @WebParam(name = "scheduleId", targetNamespace = "http://www.juntaihc.com/")
                    String scheduleId,
            @WebParam(name = "patIdCard", targetNamespace = "http://www.juntaihc.com/")
                    String patIdCard,
            @WebParam(name = "patName", targetNamespace = "http://www.juntaihc.com/")
                    String patName,
            @WebParam(name = "patSex", targetNamespace = "http://www.juntaihc.com/")
                    String patSex,
            @WebParam(name = "patPhone", targetNamespace = "http://www.juntaihc.com/")
                    String patPhone,
            @WebParam(name = "resvSjd", targetNamespace = "http://www.juntaihc.com/")
                    String resvSjd,
            @WebParam(name = "channel", targetNamespace = "http://www.juntaihc.com/")
                    String channel,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param authKEY
     * @param patIdCard
     * @param resvId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Query_Reserve", action = "http://www.juntaihc.com/JTHC_Query_Reserve")
    @WebResult(name = "JTHC_Query_ReserveResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Query_Reserve", targetNamespace = "http://www.juntaihc.com/", className = "JTHCQueryReserve")
    @ResponseWrapper(localName = "JTHC_Query_ReserveResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCQueryReserveResponse")
    public String jthcQueryReserve(
            @WebParam(name = "resvId", targetNamespace = "http://www.juntaihc.com/")
                    String resvId,
            @WebParam(name = "patIdCard", targetNamespace = "http://www.juntaihc.com/")
                    String patIdCard,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

    /**
     * 
     * @param authKEY
     * @param patIdCard
     * @param resvId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "JTHC_Cancel_Reserve", action = "http://www.juntaihc.com/JTHC_Cancel_Reserve")
    @WebResult(name = "JTHC_Cancel_ReserveResult", targetNamespace = "http://www.juntaihc.com/")
    @RequestWrapper(localName = "JTHC_Cancel_Reserve", targetNamespace = "http://www.juntaihc.com/", className = "JTHCCancelReserve")
    @ResponseWrapper(localName = "JTHC_Cancel_ReserveResponse", targetNamespace = "http://www.juntaihc.com/", className = "JTHCCancelReserveResponse")
    public String jthcCancelReserve(
            @WebParam(name = "resvId", targetNamespace = "http://www.juntaihc.com/")
                    String resvId,
            @WebParam(name = "patIdCard", targetNamespace = "http://www.juntaihc.com/")
                    String patIdCard,
            @WebParam(name = "AUTH_KEY", targetNamespace = "http://www.juntaihc.com/")
                    String authKEY);

}
