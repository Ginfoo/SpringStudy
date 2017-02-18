package party.infoo.spring.TX.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * Created by infoo on 2017/2/19.
 */
public class BankDaoImpl implements BankDao {
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void inMoney(int money, int userId) {
        String sql = "update t_bank b set b.userAccount=b.userAccount+:money where b.userId=:userId";
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("money", money);
        sps.addValue("userId", userId);
        jdbcTemplate.update(sql, sps);
    }

    @Override
    public void outMoney(int money, int userId) {
        String sql = "update t_bank b set b.userAccount=b.userAccount-:money where b.userId=:userId";
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("money", money);
        sps.addValue("userId", userId);
        jdbcTemplate.update(sql, sps);

    }


}
