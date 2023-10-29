package org.jt.blog.service;

import java.util.List;

import org.jt.blog.model.Content;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogService {
    private static final String CONTENT_TABLE = "content";
    private final JdbcTemplate jdbcTemplate;

    public void createContent(Content content) {
        var heading = content.getHeading();
        var description = content.getDescription();

        var sql = """
                INSERT INTO %s (heading, description) VALUES (?, ?)
                """.formatted(CONTENT_TABLE);

        jdbcTemplate.update(sql, heading, description);
    }

    public List<Content> getContents() {
        var sql = "SELECT * FROM %s".formatted(CONTENT_TABLE);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Content.class));
    }

    public Content getContent(int id) {
        var sql = "SELECT * FROM %s WHERE id = ?".formatted(CONTENT_TABLE);
        return jdbcTemplate
                .queryForObject(sql, new BeanPropertyRowMapper<>(Content.class), id);
    }

    public void deleteById(int id) {
        var sql = "DELETE FROM %s WHERE id = ?".formatted(CONTENT_TABLE);
        jdbcTemplate.update(sql, id);
    }
}
