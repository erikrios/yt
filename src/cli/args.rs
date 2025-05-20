use clap::{command, Parser};

use super::commands::Commands;

/// Play & download YouTube mp3 made easy
#[derive(Parser, Debug)]
#[command(version, about, long_about = None)]
pub struct Args {
    #[command(subcommand)]
    pub command: Commands,
}
