export function HeaderSection(props){
    console.log(props)
    return(
        <div>
            <h1>{props.heading}</h1>
            <p>{props.para}</p>
            <button>{props.button}</button>
            {
                props.link ? <a href={props.link}>{props.linkText}</a> : null
            }
            {
                props.aga >= 18 ? <h3>User is eligible</h3> : <h3>User is Not eligible</h3>
            }
        </div>
    )
}


