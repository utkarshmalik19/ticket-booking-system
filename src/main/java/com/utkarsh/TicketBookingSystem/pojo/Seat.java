package com.utkarsh.TicketBookingSystem.pojo;

import com.utkarsh.TicketBookingSystem.enums.SeatType;
import com.utkarsh.TicketBookingSystem.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;
    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
