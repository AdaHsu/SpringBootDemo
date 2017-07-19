package tw.adahsu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.adahsu.springboot.entity.AccessLogs;

/**
 * Created by adahsu on 2017/7/7.
 */
public interface AccessLogsRepository extends JpaRepository<AccessLogs, Long> {
}
