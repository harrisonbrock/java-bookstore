package com.harrisonbrock.bookstore.repositories;

import com.harrisonbrock.bookstore.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
