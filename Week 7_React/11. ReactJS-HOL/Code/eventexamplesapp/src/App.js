import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor() {
    super();
    this.state = { counter: 0 };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayHello = () => {
    alert("Hello! This is a static message.");
  };

  sayWelcome = (msg) => {
    alert("Say " + msg);
  };

  handleClick = (event) => {
    alert("I was clicked");
    console.log(event); // Synthetic event
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "30px" }}>
        <h1>Event Examples App</h1>

        <h2>Counter Value: {this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <br /> <br />
        <button onClick={() => this.sayWelcome("welcome")}>Say Welcome</button>

        <br /> <br />
        <button onClick={this.handleClick}>OnPress</button>

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
