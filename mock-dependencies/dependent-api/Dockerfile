# Build stage
FROM golang:1.13.1 AS builder
WORKDIR /go/src/
COPY go.mod go.sum ./
RUN go mod download
COPY . .
RUN CGO_ENABLED=0 go build -o app # "CGO_ENABLED=0" will make the app build with static links

# Run stage
FROM alpine:3.10.2
COPY --from=builder /go/src/app .
EXPOSE 9090
ENTRYPOINT ["./app"]
