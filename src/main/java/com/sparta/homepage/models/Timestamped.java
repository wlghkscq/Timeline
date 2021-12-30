package com.sparta.homepage.models;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter // board에 작성시간, 수정시간 들어감
@MappedSuperclass // Entity가 자동으로 컬럼인식
@EntityListeners(AuditingEntityListener.class) // 생성,변경 시간 자동 업데이트
public abstract class Timestamped {

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

}
