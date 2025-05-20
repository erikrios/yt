mod cli;

use clap::Parser;
use cli::{Args, Commands};

fn main() {
    let args = Args::parse();
    match args.command {
        Commands::Play { url } => {
            println!("Playing: {}", url);
        }
        Commands::Download { url, output } => {
            println!("Downloading: {} to {}", url, output);
        }
    }
}
