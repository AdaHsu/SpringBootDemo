package tw.adahsu.springboot.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by adahsu on 2017/7/7.
 */
@Entity
public class AccessLogs {

    @Id
    @GeneratedValue
    private long pkid;

    @Column(columnDefinition="DATETIME DEFAULT NOW()", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(columnDefinition = "VARCHAR(64)")
    private String hostname;

    @Column(columnDefinition = "VARCHAR(16)")
    private String client;

    @Column( columnDefinition = "VARCHAR(16)")
    private String action;

    public long getPkid() {
        return pkid;
    }

    public void setPkid(long pkid) {
        this.pkid = pkid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
