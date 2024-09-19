CREATE TABLE member (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 자동 증가하는 ID
                        username VARCHAR(255) NOT NULL,        -- 사용자 이름
                        password VARCHAR(255) NOT NULL,        -- 비밀번호
                        email VARCHAR(255)                     -- 이메일
);
