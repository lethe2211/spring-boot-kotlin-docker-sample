package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
)

// Response Status: status of the response
type Response struct {
	Status string `json:"status"`
}

func root(w http.ResponseWriter, r *http.Request) {
	response, _ := json.Marshal(Response{"OK"})
	w.Header().Set("Content-Type", "application/json; charset=utf-8")
	fmt.Fprintf(w, string(response))
	log.Printf("success: %v\n", string(response))
}

func main() {
	log.Println("Starting Web server...")

	http.HandleFunc("/", root)
	err := http.ListenAndServe(":9090", nil)

	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}

	log.Println("Exiting Web server...")
}
