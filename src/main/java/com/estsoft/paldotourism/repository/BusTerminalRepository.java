package com.estsoft.paldotourism.repository;

import com.estsoft.paldotourism.entity.BusTerminal;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusTerminalRepository extends JpaRepository<BusTerminal,String> {

    Optional<BusTerminal> findByName(String terminalName);
}
