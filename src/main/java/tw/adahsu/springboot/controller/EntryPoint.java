package tw.adahsu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tw.adahsu.springboot.entity.AccessLogs;
import tw.adahsu.springboot.repository.AccessLogsRepository;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by adahsu on 2017/7/7.
 */
@RestController
public class EntryPoint {

    @Autowired
    private AccessLogsRepository accessLogsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHostname(HttpServletRequest req) {

        String hostname = req.getLocalName();
        String client = req.getRemoteAddr();
        AccessLogs accessLogs = new AccessLogs();
        accessLogs.setHostname( hostname );
        accessLogs.setAction( "getHostname");
        accessLogs.setClient( client );
        accessLogsRepository.save( accessLogs );

        return String.format( "%s\n", hostname );
    }

    @RequestMapping(value = "/crash", method = RequestMethod.GET)
    public void setCrash(HttpServletRequest req) {

        String hostname = req.getLocalName();
        String client = req.getRemoteAddr();
        AccessLogs accessLogs = new AccessLogs();
        accessLogs.setHostname( hostname );
        accessLogs.setAction( "setCrash");
        accessLogs.setClient( client );
        accessLogsRepository.save( accessLogs );

        System.exit( -1 );
    }

}
