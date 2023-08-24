package ticketSales

import (
	"github.com/google/uuid"
	"encoding/json"
	"math/rand"
	"time"
)

type Status string

const (
	SOLD             Status = "SOLD"
	CANCELED         Status = "CANCELED"
	USED             Status = "USED"
	RESERVED         Status = "RESERVED"
	AWAITING_PAYMENT Status = "AWAITING_PAYMENT"
	EXPIRED          Status = "EXPIRED"
	TRANSFERRED      Status = "TRANSFERRED"
)

var statusNames = []Status{
	SOLD,
	CANCELED,
	USED,
	RESERVED,
	AWAITING_PAYMENT,
	EXPIRED,
	TRANSFERRED,
}

type Type string

const (
	VIP                Type = "VIP"
	REGULAR            Type = "REGULAR"
	STUDENT            Type = "STUDENT"
	CHILD              Type = "CHILD"
	SENIOR             Type = "SENIOR"
	GENERAL_ACCESS     Type = "GENERAL_ACCESS"
	NUMBERED_SEAT      Type = "NUMBERED_SEAT"
	FAMILY             Type = "FAMILY"
	VIP_MEET_AND_GREET Type = "VIP_MEET_AND_GREET"
)

var typeNames = []Type{
	VIP,
	REGULAR,
	STUDENT,
	CHILD,
	SENIOR,
	GENERAL_ACCESS,
	NUMBERED_SEAT,
	FAMILY,
	VIP_MEET_AND_GREET,
}

type TicketSales struct {
	ID         uuid.UUID `json:"id"`
	Type       Type    `json:"type"`
	Status     Status    `json:"status"`
	EventID    uuid.UUID `json:"event_id"`
	SeatID     uuid.UUID `json:"seat_id"`
	Price      float32   `json:"price"`
	Discount   float32   `json:"discount"`
	TotalPrice float32   `json:"total_price"`
	BuyerID    uuid.UUID `json:"buyer_id"`
}

func NewTicketSales() *TicketSales {
	return &TicketSales{}
}

func (ticketSales *TicketSales) GerateTicketSales() {
	rand.Seed(time.Now().UnixNano())

	ticketSales.ID = uuid.New()
	ticketSales.Type = typeNames[rand.Intn(len(typeNames))]
	ticketSales.Status = statusNames[rand.Intn(len(statusNames))]
	ticketSales.EventID = uuid.New()
	ticketSales.SeatID = uuid.New()
	ticketSales.Price = rand.Float32() * 100.0
	ticketSales.Discount = rand.Float32() * ticketSales.Price
	ticketSales.TotalPrice = ticketSales.Price - ticketSales.Discount
	ticketSales.BuyerID = uuid.New()
}

func (ticketSales *TicketSales) ExportJsonTicketSales() (string, error) {
	var result string

	jsonRoute, err := json.Marshal(ticketSales)
	if err != nil {
		return "", err
	}

	result = string(jsonRoute)

	return result, nil
}