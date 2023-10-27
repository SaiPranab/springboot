package org.jt.blog.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogService {
    private static final String CONTENT_TABLE = "content";
    private final JdbcTemplate jdbcTemplate;
}
