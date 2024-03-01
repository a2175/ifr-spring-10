package study.datajpa.repository;

import org.springframework.data.jpa.repository.*;
import study.datajpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
