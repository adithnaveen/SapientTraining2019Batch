import React, { Component } from 'react';

class Test extends Component {
    state = { title: 'Hello, World!' }

    changeTitle = () => {
        console.log('this is', this);
        this.setState({ title: 'Hello, React!' });
    }

    render() {

        setInterval(()=>{
            this.setState({title: 'Hello, ' + Math.random()})
        }, 2000);


        return (
            <div>
                <h1>{this.state.title}</h1>
                <button onClick={this.changeTitle}>Change title</button>
            </div>
        );
    }
}

export default Test;