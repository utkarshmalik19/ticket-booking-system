package com.utkarsh.TicketBookingSystem.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    private LocalDateTime showTime;
    private int theatreNumber;
    private double basePrice;
}
