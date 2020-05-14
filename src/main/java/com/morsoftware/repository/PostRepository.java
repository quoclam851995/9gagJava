package com.morsoftware.repository; // tuong duong voi DAO o trong jdbc sevlet jsp

import com.morsoftware.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface  PostRepository extends JpaRepository<PostEntity, Long> {

}
