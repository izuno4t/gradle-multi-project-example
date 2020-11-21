package com.example.core.dao;

import com.example.core.entity.Reservation;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutowireable
@Dao
public interface ReservationDao {
    @Select
    List<Reservation> selectAll();

    @Insert
    @Transactional
    int insert(Reservation reservation);
}
